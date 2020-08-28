package com.huaweicloud.sdk.projectman.v4.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.IssueRecordV4Details;
import com.huaweicloud.sdk.projectman.v4.model.IssueRecordV4User;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 历史记录
 */
public class IssueRecordV4  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user")
    
    private IssueRecordV4User user = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="details")
    
    private List<IssueRecordV4Details> details = null;
    
    public IssueRecordV4 withUser(IssueRecordV4User user) {
        this.user = user;
        return this;
    }

    public IssueRecordV4 withUser(Consumer<IssueRecordV4User> userSetter) {
        if(this.user == null ){
            this.user = new IssueRecordV4User();
            userSetter.accept(this.user);
        }
        
        return this;
    }


    /**
     * Get user
     * @return user
     */
    public IssueRecordV4User getUser() {
        return user;
    }

    public void setUser(IssueRecordV4User user) {
        this.user = user;
    }

    public IssueRecordV4 withDetails(List<IssueRecordV4Details> details) {
        this.details = details;
        return this;
    }

    
    public IssueRecordV4 addDetailsItem(IssueRecordV4Details detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    public IssueRecordV4 withDetails(Consumer<List<IssueRecordV4Details>> detailsSetter) {
        if(this.details == null ){
            this.details = new ArrayList<>();
        }
        detailsSetter.accept(this.details);
        return this;
    }

    /**
     * 操作的记录
     * @return details
     */
    public List<IssueRecordV4Details> getDetails() {
        return details;
    }

    public void setDetails(List<IssueRecordV4Details> details) {
        this.details = details;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueRecordV4 issueRecordV4 = (IssueRecordV4) o;
        return Objects.equals(this.user, issueRecordV4.user) &&
            Objects.equals(this.details, issueRecordV4.details);
    }
    @Override
    public int hashCode() {
        return Objects.hash(user, details);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueRecordV4 {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

