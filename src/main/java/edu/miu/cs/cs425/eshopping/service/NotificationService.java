package edu.miu.cs.cs425.eshopping.service;

import edu.miu.cs.cs425.eshopping.model.Notification;

import java.util.List;

public interface NotificationService {
    Notification addNotification(Notification notification);

    List<Notification> getAll();

    List<Notification> getAllUnSeen();

    Notification getNotification(Long id);

    void deleteNotification(Long id);

    Notification editNotification(Notification notification);
}
