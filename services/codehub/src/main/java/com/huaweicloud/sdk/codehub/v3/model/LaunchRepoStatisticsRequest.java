package com.huaweicloud.sdk.codehub.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * LaunchRepoStatisticsRequest
 */
public class LaunchRepoStatisticsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="branch_name")
    
    private String branchName;

    public LaunchRepoStatisticsRequest withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    


    /**
     * 仓库分支名
     * @return branchName
     */
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LaunchRepoStatisticsRequest launchRepoStatisticsRequest = (LaunchRepoStatisticsRequest) o;
        return Objects.equals(this.branchName, launchRepoStatisticsRequest.branchName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(branchName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LaunchRepoStatisticsRequest {\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
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

