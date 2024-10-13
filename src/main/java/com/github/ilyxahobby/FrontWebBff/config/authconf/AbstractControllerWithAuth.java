package com.github.ilyxahobby.FrontWebBff.config.authconf;

import java.util.UUID;

public abstract class AbstractControllerWithAuth {

    private UUID userId;

    public AbstractControllerWithAuth() {
        this.userId = null;
    }

    protected UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
}
