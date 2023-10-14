package ru.company.app.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public enum Role {
    EMPLOYEE, //сотрудник, просматривает задачи
    MANAGER, //менеджер, управляет сотрудниками
    ADMIN //администратор, только один на всем сайте и имеет доступ ко всему функционалу
}
