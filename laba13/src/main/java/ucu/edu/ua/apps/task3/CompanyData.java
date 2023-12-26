package ucu.edu.ua.apps.task3;

import lombok.Builder;
import lombok.Getter;

@Builder
public class CompanyData {
    private String domain;
    private String description;
    private String logo;
    private String address;
}
