package com.huaweicloud.sdk.sms.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sms.v3.model.MigrationErrors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListErrorServersResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="migration_errors")
    
    private List<MigrationErrors> migrationErrors = null;
    
    public ListErrorServersResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 迁移过程中发生错误的源端数量
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListErrorServersResponse withMigrationErrors(List<MigrationErrors> migrationErrors) {
        this.migrationErrors = migrationErrors;
        return this;
    }

    
    public ListErrorServersResponse addMigrationErrorsItem(MigrationErrors migrationErrorsItem) {
        if (this.migrationErrors == null) {
            this.migrationErrors = new ArrayList<>();
        }
        this.migrationErrors.add(migrationErrorsItem);
        return this;
    }

    public ListErrorServersResponse withMigrationErrors(Consumer<List<MigrationErrors>> migrationErrorsSetter) {
        if(this.migrationErrors == null ){
            this.migrationErrors = new ArrayList<>();
        }
        migrationErrorsSetter.accept(this.migrationErrors);
        return this;
    }

    /**
     * 迁移过程中发生的错误详情
     * @return migrationErrors
     */
    public List<MigrationErrors> getMigrationErrors() {
        return migrationErrors;
    }

    public void setMigrationErrors(List<MigrationErrors> migrationErrors) {
        this.migrationErrors = migrationErrors;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListErrorServersResponse listErrorServersResponse = (ListErrorServersResponse) o;
        return Objects.equals(this.count, listErrorServersResponse.count) &&
            Objects.equals(this.migrationErrors, listErrorServersResponse.migrationErrors);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, migrationErrors);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListErrorServersResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    migrationErrors: ").append(toIndentedString(migrationErrors)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

