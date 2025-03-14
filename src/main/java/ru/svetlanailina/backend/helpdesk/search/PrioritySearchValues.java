package ru.svetlanailina.backend.helpdesk.search;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
// возможные значения, по которым можно искать приоритеты
public class PrioritySearchValues {

    private String title; // такое же название должно быть у объекта на frontend - необязательно заполнять
    private String email; // для фильтрации значений конкретного пользователя - обязательно заполнять

}
