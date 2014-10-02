package com.apress.springrecipes.sequence;

import java.util.List;

/**
 * Created by Matrix on 02.10.2014.
 */
public class SequenceGenerator {

    private String prefix;
    private String suffix;
    private int initial;
    private int counter;
    private Object[] suffixes;


    public SequenceGenerator() {
    }

    public SequenceGenerator(String prefix, String suffix, int initial) {
        this.prefix = prefix;
        this.suffix = suffix;
        this.initial = initial;
    }

    public void setSuffixes(Object[] suffixes) {
        this.suffixes = suffixes;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public synchronized String getSequence() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(prefix);
        buffer.append(initial + counter++);
        buffer.append(suffix);
        for (Object o : suffixes) {
            buffer.append("-");
            buffer.append(o);
        }
        return buffer.toString();
    }
}
