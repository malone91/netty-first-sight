package com.melo.netty.common.pojo;

import java.io.Serializable;

/**
 * Created by Ablert
 * on 2018/6/28.
 * @author Ablert
 */
public class CustomProtocol implements Serializable {

    private static final long serialVersionUID = -8793754038985287080L;

    private long id;

    private String content;

    public CustomProtocol() {
    }

    public CustomProtocol(String content, long id) {
        this.content = content;
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CustomProtocol{" +
                "content='" + content + '\'' +
                ", id=" + id +
                '}';
    }
}
