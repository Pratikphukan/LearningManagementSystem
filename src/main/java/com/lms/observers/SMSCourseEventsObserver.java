package com.lms.observers;

import com.lms.services.CourseEventsNotifier;

public class SMSCourseEventsObserver implements CourseEventsObserver {

    private static SMSCourseEventsObserver smsCourseEventsObserver;

    private SMSCourseEventsObserver() {
        CourseEventsNotifier courseEventsNotifier = CourseEventsNotifier.getInstance();
        courseEventsNotifier.registerObserver(this);
    }

    public static SMSCourseEventsObserver getInstance() {
        if (smsCourseEventsObserver == null) {
            smsCourseEventsObserver = new SMSCourseEventsObserver();
        }
        return smsCourseEventsObserver;
    }

    @Override
    public void notifyCourseEvent() {
        System.out.println("SMS sent.......");
    }
}
