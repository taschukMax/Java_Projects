package com.yakov_fain.practical_java.lesson17;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee2 implements Externalizable {
    String name;
    String lName;
    transient double salary;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeChars(name);
        out.writeChars(lName);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        lName = (String) in.readObject();
    }
}
