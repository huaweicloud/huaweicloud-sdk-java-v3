package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTaskSettingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private List<TaskAdvancedSettings> info = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ShowTaskSettingsResponse withInfo(List<TaskAdvancedSettings> info) {
        this.info = info;
        return this;
    }

    public ShowTaskSettingsResponse addInfoItem(TaskAdvancedSettings infoItem) {
        if (this.info == null) {
            this.info = new ArrayList<>();
        }
        this.info.add(infoItem);
        return this;
    }

    public ShowTaskSettingsResponse withInfo(Consumer<List<TaskAdvancedSettings>> infoSetter) {
        if (this.info == null) {
            this.info = new ArrayList<>();
        }
        infoSetter.accept(this.info);
        return this;
    }

    /**
     * 高级选项的相关信息
     * @return info
     */
    public List<TaskAdvancedSettings> getInfo() {
        return info;
    }

    public void setInfo(List<TaskAdvancedSettings> info) {
        this.info = info;
    }

    public ShowTaskSettingsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskSettingsResponse that = (ShowTaskSettingsResponse) obj;
        return Objects.equals(this.info, that.info) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(info, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskSettingsResponse {\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
