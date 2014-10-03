package com.apress.springrecipes.sequence;

import org.springframework.beans.factory.annotation.Required;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matrix on 02.10.2014.
 */
public class SequenceGenerator {

    private PrefixGenerator prefixGenerator;

    private String prefix;
    private String suffix;
    private int initial;
    private int counter;
    private List<Integer> suffixes = new ArrayList<>();

    {
        suffixes.add(5);
        suffixes.add(15);
        suffixes.add(25);
    }


    public SequenceGenerator() {
    }

    @Required
    public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
        this.prefixGenerator = prefixGenerator;
    }

    /* public SequenceGenerator(int initial, String suffix) {
        this.initial = initial;
        this.suffix = suffix;
    }

    public SequenceGenerator(String prefix, int initial) {
        this.prefix = prefix;
        this.initial = initial;
    }

    public SequenceGenerator(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public SequenceGenerator(String prefix, String suffix, int initial) {
        this.prefix = prefix;
        this.suffix = suffix;
        this.initial = initial;
    }*/

    public void setSuffixes(List<Integer> suffixes) {
        this.suffixes = suffixes;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Required
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Mandatory
    public void setInitial(int initial) {
        this.initial = initial;
    }

    public synchronized String getSequence() {
        StringBuffer buffer = new StringBuffer();
        //buffer.append(prefix);
        buffer.append(prefixGenerator.getPrefix());
        buffer.append(initial + counter++);
        //buffer.append(suffix);
        DecimalFormat formatter = new DecimalFormat("0000");
        for (Integer suffix : suffixes) {
            buffer.append("-");
            buffer.append(formatter.format(suffix));
        }
        return buffer.toString();
    }
}
