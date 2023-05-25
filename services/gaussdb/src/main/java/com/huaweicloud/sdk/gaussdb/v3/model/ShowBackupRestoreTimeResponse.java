package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.RestoreTimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowBackupRestoreTimeResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="restore_times")
    
    private List<RestoreTimeInfo> restoreTimes = null;
    
    public ShowBackupRestoreTimeResponse withRestoreTimes(List<RestoreTimeInfo> restoreTimes) {
        this.restoreTimes = restoreTimes;
        return this;
    }

    
    public ShowBackupRestoreTimeResponse addRestoreTimesItem(RestoreTimeInfo restoreTimesItem) {
        if(this.restoreTimes == null) {
            this.restoreTimes = new ArrayList<>();
        }
        this.restoreTimes.add(restoreTimesItem);
        return this;
    }

    public ShowBackupRestoreTimeResponse withRestoreTimes(Consumer<List<RestoreTimeInfo>> restoreTimesSetter) {
        if(this.restoreTimes == null) {
            this.restoreTimes = new ArrayList<>();
        }
        restoreTimesSetter.accept(this.restoreTimes);
        return this;
    }

    /**
     * 可恢复时间段列表。
     * @return restoreTimes
     */
    public List<RestoreTimeInfo> getRestoreTimes() {
        return restoreTimes;
    }

    public void setRestoreTimes(List<RestoreTimeInfo> restoreTimes) {
        this.restoreTimes = restoreTimes;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBackupRestoreTimeResponse showBackupRestoreTimeResponse = (ShowBackupRestoreTimeResponse) o;
        return Objects.equals(this.restoreTimes, showBackupRestoreTimeResponse.restoreTimes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(restoreTimes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupRestoreTimeResponse {\n");
        sb.append("    restoreTimes: ").append(toIndentedString(restoreTimes)).append("\n");
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

