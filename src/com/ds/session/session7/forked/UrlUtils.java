// --------------------------------------------------------------------------------
// Copyright 2002-2019 Echo Three, LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// --------------------------------------------------------------------------------

package com.ds.session.session7.forked;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;

public class UrlUtils {
    
    private UrlUtils() {
        super();
    }
    
    private static class UrlUtilsHolder {
        static UrlUtils instance = new UrlUtils();
    }
    
    public static UrlUtils getInstance() {
        return UrlUtilsHolder.instance;
    }
    


    public StringBuilder buildParams(StringBuilder url, Map<String, String> params) {
        if(params != null && params.size() > 0) {
            Set<Map.Entry<String, String>> entrySet = params.entrySet();
            boolean isFirst = true;

            for(Map.Entry<String, String> entry : entrySet) {
                url.append(isFirst ? '?' : '&');
                try {
                    url.append(entry.getKey()).append('=').append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                } catch(UnsupportedEncodingException uee) {
                    // If UTF-8 isn't a supported encoding, then there are severe problems.
                    throw new RuntimeException(uee);
                }
                isFirst = false;
            }
        }

        return url;
    }


    
}
