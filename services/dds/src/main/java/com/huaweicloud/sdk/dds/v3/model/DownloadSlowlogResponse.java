package com.huaweicloud.sdk.dds.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.DownloadSlowlogResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class DownloadSlowlogResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="list")
    
    private List<DownloadSlowlogResult> list = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;

    public DownloadSlowlogResponse withList(List<DownloadSlowlogResult> list) {
        this.list = list;
        return this;
    }

    
    public DownloadSlowlogResponse addListItem(DownloadSlowlogResult listItem) {
        if(this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public DownloadSlowlogResponse withList(Consumer<List<DownloadSlowlogResult>> listSetter) {
        if(this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 具体信息。
     * @return list
     */
    public List<DownloadSlowlogResult> getList() {
        return list;
    }

    public void setList(List<DownloadSlowlogResult> list) {
        this.list = list;
    }

    

    public DownloadSlowlogResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 慢日志下载链接生成状态。 - FINISH，表示下载链接已经生成完成。 - CREATING，表示正在生成文件，准备下载链接。 - FAILED，表示存在日志文件准备失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public DownloadSlowlogResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 慢日志链接数量。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadSlowlogResponse downloadSlowlogResponse = (DownloadSlowlogResponse) o;
        return Objects.equals(this.list, downloadSlowlogResponse.list) &&
            Objects.equals(this.status, downloadSlowlogResponse.status) &&
            Objects.equals(this.count, downloadSlowlogResponse.count);
    }
    @Override
    public int hashCode() {
        return Objects.hash(list, status, count);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadSlowlogResponse {\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

