package net.welights.headfirst.observer.wetaher;

/**
 * @author fandong
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
