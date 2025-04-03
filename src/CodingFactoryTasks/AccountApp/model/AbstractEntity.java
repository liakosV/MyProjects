package CodingFactoryTasks.AccountApp.model;

import java.util.UUID;

public abstract class AbstractEntity {
    private String uuid;

    public AbstractEntity() {
        uuid = UUID.randomUUID().toString();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
