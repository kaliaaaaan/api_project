package config;

import org.aeonbits.owner.Config;

public interface ApiConfig extends Config {

    @Key("baseUri")
    @DefaultValue("https://reqres.in")
    String baseUri();

    @Key("basePath")
    @DefaultValue("/api")
    String basePath();

}