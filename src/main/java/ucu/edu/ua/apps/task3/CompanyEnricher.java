package ucu.edu.ua.apps.task3;

public class CompanyEnricher {
    public CompanyData enrich(String domain, String description, String logo,String address) {
        return CompanyData.builder()
        .domain(domain)
        .description(description)
        .logo(logo)
        .address(address)
        .build();
    }
}
