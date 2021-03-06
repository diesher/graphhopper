/*
 *  Licensed to GraphHopper and Peter Karich under one or more contributor license 
 *  agreements. See the NOTICE file distributed with this work for 
 *  additional information regarding copyright ownership.
 * 
 *  GraphHopper licenses this file to you under the Apache License, 
 *  Version 2.0 (the "License"); you may not use this file except 
 *  in compliance with the License. You may obtain a copy of the 
 *  License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.graphhopper.util;

import static java.lang.Math.*;

/**
 * Calculates the distance of two points or one point and an edge in euclidean
 * space.
 *
 * @author Peter Karich
 */
public class DistanceCalc2D extends DistanceCalc {

    @Override
    public double calcDist(double fromY, double fromX, double toY, double toX) {
        return sqrt(calcNormalizedDist(fromY, fromX, toY, toX));
    }

    @Override
    public double calcDenormalizedDist(double normedDist) {
        return sqrt(normedDist);
    }

    /**
     * Returns the specified length in normalized meter.
     */
    @Override
    public double calcNormalizedDist(double dist) {
        return dist * dist;
    }

    /**
     * Calculates in normalized meter
     */
    @Override
    public double calcNormalizedDist(double fromY, double fromX, double toY, double toX) {
        double dX = fromX - toX;
        double dY = fromY - toY;
        return dX * dX + dY * dY;
    }

    @Override
    public String toString() {
        return "2D";
    }
}
