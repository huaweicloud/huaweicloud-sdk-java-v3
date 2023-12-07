package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteBaseDTO
 */
public class BatchDeleteBaseDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_id")

    private String dwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    public BatchDeleteBaseDTO withDwId(String dwId) {
        this.dwId = dwId;
        return this;
    }

    /**
     * 数据连接id
     * @return dwId
     */
    public String getDwId() {
        return dwId;
    }

    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    public BatchDeleteBaseDTO withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public BatchDeleteBaseDTO addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public BatchDeleteBaseDTO withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * id列表
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteBaseDTO that = (BatchDeleteBaseDTO) obj;
        return Objects.equals(this.dwId, that.dwId) && Objects.equals(this.ids, that.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dwId, ids);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteBaseDTO {\n");
        sb.append("    dwId: ").append(toIndentedString(dwId)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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
