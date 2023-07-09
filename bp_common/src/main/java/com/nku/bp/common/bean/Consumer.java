package com.nku.bp.common.bean;

import java.io.Closeable;
import java.io.IOException;

public interface Consumer extends Closeable {
    // consume data
    void consumer() throws IOException;
}
