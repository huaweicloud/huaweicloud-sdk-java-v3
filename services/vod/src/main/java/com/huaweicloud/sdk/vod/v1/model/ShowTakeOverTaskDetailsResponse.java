package com.huaweicloud.sdk.vod.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.AssetDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowTakeOverTaskDetailsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private String taskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_status")
    
    private String taskStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="assets")
    
    private List<AssetDetails> assets = null;
    
    public ShowTakeOverTaskDetailsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ShowTakeOverTaskDetailsResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * 任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    

    public ShowTakeOverTaskDetailsResponse withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    


    /**
     * 任务状态。
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    

    public ShowTakeOverTaskDetailsResponse withAssets(List<AssetDetails> assets) {
        this.assets = assets;
        return this;
    }

    
    public ShowTakeOverTaskDetailsResponse addAssetsItem(AssetDetails assetsItem) {
        if(this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(assetsItem);
        return this;
    }

    public ShowTakeOverTaskDetailsResponse withAssets(Consumer<List<AssetDetails>> assetsSetter) {
        if(this.assets == null) {
            this.assets = new ArrayList<>();
        }
        assetsSetter.accept(this.assets);
        return this;
    }

    /**
     * 媒资信息。
     * @return assets
     */
    public List<AssetDetails> getAssets() {
        return assets;
    }

    public void setAssets(List<AssetDetails> assets) {
        this.assets = assets;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTakeOverTaskDetailsResponse showTakeOverTaskDetailsResponse = (ShowTakeOverTaskDetailsResponse) o;
        return Objects.equals(this.total, showTakeOverTaskDetailsResponse.total) &&
            Objects.equals(this.taskId, showTakeOverTaskDetailsResponse.taskId) &&
            Objects.equals(this.taskStatus, showTakeOverTaskDetailsResponse.taskStatus) &&
            Objects.equals(this.assets, showTakeOverTaskDetailsResponse.assets);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, taskId, taskStatus, assets);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTakeOverTaskDetailsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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

