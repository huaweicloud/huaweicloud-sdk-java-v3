package com.huaweicloud.sdk.das.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.das.v3.model.DbUser;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowDbUserResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_user")
    
    private DbUser dbUser = null;

    public ShowDbUserResponse withDbUser(DbUser dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    public ShowDbUserResponse withDbUser(Consumer<DbUser> dbUserSetter) {
        if(this.dbUser == null ){
            this.dbUser = new DbUser();
            dbUserSetter.accept(this.dbUser);
        }
        
        return this;
    }


    /**
     * Get dbUser
     * @return dbUser
     */
    public DbUser getDbUser() {
        return dbUser;
    }

    public void setDbUser(DbUser dbUser) {
        this.dbUser = dbUser;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDbUserResponse showDbUserResponse = (ShowDbUserResponse) o;
        return Objects.equals(this.dbUser, showDbUserResponse.dbUser);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dbUser);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDbUserResponse {\n");
        sb.append("    dbUser: ").append(toIndentedString(dbUser)).append("\n");
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

