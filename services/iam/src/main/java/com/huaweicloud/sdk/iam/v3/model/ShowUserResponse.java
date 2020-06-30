package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.ShowUserResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowUserResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user")
    
    private ShowUserResult user = null;

    public ShowUserResponse withUser(ShowUserResult user) {
        this.user = user;
        return this;
    }

    public ShowUserResponse withUser(Consumer<ShowUserResult> userSetter) {
        if(this.user == null ){
            this.user = new ShowUserResult();
            userSetter.accept(this.user);
        }
        
        return this;
    }


    /**
     * Get user
     * @return user
     */
    public ShowUserResult getUser() {
        return user;
    }

    public void setUser(ShowUserResult user) {
        this.user = user;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowUserResponse showUserResponse = (ShowUserResponse) o;
        return Objects.equals(this.user, showUserResponse.user);
    }
    @Override
    public int hashCode() {
        return Objects.hash(user);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserResponse {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

