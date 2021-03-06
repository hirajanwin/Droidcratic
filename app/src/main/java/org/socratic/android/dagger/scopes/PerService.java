package org.socratic.android.dagger.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by jessicaweinberg on 10/10/17.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerService {}
