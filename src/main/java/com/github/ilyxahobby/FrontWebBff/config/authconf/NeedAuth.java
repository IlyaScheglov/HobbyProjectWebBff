package com.github.ilyxahobby.FrontWebBff.config.authconf;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface NeedAuth {
}
