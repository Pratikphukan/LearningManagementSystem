package com.lms.services;

import com.lms.observers.CourseEventsObserver;

import java.util.ArrayList;
import java.util.List;

public class CourseEventsNotifier {

    private static CourseEventsNotifier courseEventsNotifier;

    private final List<CourseEventsObserver> observers = new ArrayList<>();

    private CourseEventsNotifier() {
        // Private constructor to prevent instantiation
    }

    public static CourseEventsNotifier getInstance() {
        if (courseEventsNotifier == null) {
            courseEventsNotifier = new CourseEventsNotifier();
        }
        return courseEventsNotifier;
    }

    public void registerObserver(CourseEventsObserver observer) {
        observers.add(observer);
    }

    public void deregisterObserver(CourseEventsObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (CourseEventsObserver observer : observers) {
            observer.notifyCourseEvent();
        }
    }
}
