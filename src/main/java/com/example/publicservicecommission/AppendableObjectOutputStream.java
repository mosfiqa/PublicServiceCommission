package com.example.publicservicecommission;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import static com.sun.javafx.scene.input.TouchPointHelper.reset;

public class AppendableObjectOutputStream extends ObjectOutputStream {

    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        // Prevent writing a new header when appending
        reset();
    }
}