package com.lms.observers;

import com.lms.services.CourseEventsNotifier;

public class EmailCourseEventsObserver implements CourseEventsObserver {

    private static EmailCourseEventsObserver emailCourseEventsObserver;

    private EmailCourseEventsObserver() {
        CourseEventsNotifier courseEventsNotifier = CourseEventsNotifier.getInstance();
        courseEventsNotifier.registerObserver(this);
    }

    public static EmailCourseEventsObserver getInstance() {
        if (emailCourseEventsObserver == null) {
            emailCourseEventsObserver = new EmailCourseEventsObserver();
        }
        return emailCourseEventsObserver;
    }

    @Override
    public void notifyCourseEvent() {
        System.out.println("Email sent.......");
    }
}
