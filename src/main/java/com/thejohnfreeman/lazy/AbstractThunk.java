package com.thejohnfreeman.lazy;

/**
 * Abstract base class for thunks that return a single value.
 *
 * @param <T> the type of the value
 */
public abstract class AbstractThunk<T>
    implements TaggableLazy<T>
{
    /**
     * A null _value does not mean it has not been computed. For that, call
     * {@link #isForced()}.
     */
    protected T _value;

    @Override
    public T getValue()
        throws IllegalStateException
    {
        if (!isForced()) {
            throw new IllegalStateException("not yet forced");
        }
        return _value;
    }

    @Override
    public String toString() {
        return isForced() ? String.valueOf(_value) : toStringUnforced("...");
    }
}
