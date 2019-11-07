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


public class TextileUtils {
    
    private TextileUtils() {
        super();
    }
    
    private static class TextileUtilsHolder {
        static TextileUtils instance = new TextileUtils();
    }
    
    public static TextileUtils getInstance() {
        return TextileUtilsHolder.instance;
    }
    
    public String filter(final String originalContent) {
        return  originalContent.replace("e","");
    }
    
}
