package com.cleanroommc.modularui.utils.math.functions.classic;

import com.cleanroommc.modularui.api.IValue;
import com.cleanroommc.modularui.utils.math.functions.NNFunction;

/**
 * Absolute value function
 */
public class Abs extends NNFunction {

    public Abs(IValue[] values, String name) throws Exception {
        super(values, name);
    }

    @Override
    public int getRequiredArguments() {
        return 1;
    }

    @Override
    public double doubleValue() {
        return Math.abs(this.getArg(0).doubleValue());
    }
}