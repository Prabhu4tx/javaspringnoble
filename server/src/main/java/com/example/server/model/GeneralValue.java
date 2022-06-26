package com.example.server.model;

import javax.persistence.GenerationType;

public @interface GeneralValue {
    GenerationType strategy();
}
