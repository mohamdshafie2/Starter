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

package com.ds.session.session5.forked;


import java.util.Formatter;

public class GeoPointUtils {

    private GeoPointUtils() {
        super();
    }

    private static class GeoPointUtilsHolder {
        static GeoPointUtils instance = new GeoPointUtils();
    }

    public static GeoPointUtils getInstance() {
        return GeoPointUtilsHolder.instance;
    }

    public String formatDegrees(Integer degrees) {
        int rawDegrees = degrees;
        int i = (int) Math.pow(10, 6);
        StringBuilder builtResult = new StringBuilder().append(rawDegrees / i).append(".");
        StringBuilder formatString = new StringBuilder().append("%0").append(6).append("d");

        return new Formatter(builtResult).format(formatString.toString(), Math.abs(rawDegrees) % i).toString();
    }
    
}
