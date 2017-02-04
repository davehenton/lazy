package com.thejohnfreeman.function;

/**
 * A function of four arguments.
 *
 * @param <A> the type of the first argument
 * @param <B> the type of the second argument
 * @param <C> the type of the third argument
 * @param <D> the type of the fourth argument
 * @param <R> the type of the result
 */
@FunctionalInterface
public interface Function4<A, B, C, D, R>
{
    R apply(A a, B b, C c, D d);
}
