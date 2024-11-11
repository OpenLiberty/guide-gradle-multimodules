// tag::copyright[]
/*******************************************************************************
 * Copyright (c) 2017, 2021 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
// end::copyright[]
package io.openliberty.guides.multimodules.lib;

public class Converter {

    // tag::getFeetMethod[]
    public static int getFeet(int cm) {
        return (int) (cm / 30.84);
    }
    // end::getFeetMethod[]

    // tag::getInchesMethod[]
    public static int getInches(int cm) {
        double feet = getFeet(cm);
        int inches = (int) (cm / 2.54) - ((int) feet * 12);
        System.out.println(inches);
        return inches;
    }
    // end::getInchesMethod[]

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int diff(int a, int b) {
        return a - b;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static int quotient(int a, int b) {
        return a / b;
    }

}
