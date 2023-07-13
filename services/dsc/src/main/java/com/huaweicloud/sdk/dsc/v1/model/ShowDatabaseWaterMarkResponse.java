package com.huaweicloud.sdk.dsc.v1.model;

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
public class ShowDatabaseWaterMarkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermarks")

    private List<String> watermarks = null;

    public ShowDatabaseWaterMarkResponse withWatermarks(List<String> watermarks) {
        this.watermarks = watermarks;
        return this;
    }

    public ShowDatabaseWaterMarkResponse addWatermarksItem(String watermarksItem) {
        if (this.watermarks == null) {
            this.watermarks = new ArrayList<>();
        }
        this.watermarks.add(watermarksItem);
        return this;
    }

    public ShowDatabaseWaterMarkResponse withWatermarks(Consumer<List<String>> watermarksSetter) {
        if (this.watermarks == null) {
            this.watermarks = new ArrayList<>();
        }
        watermarksSetter.accept(this.watermarks);
        return this;
    }

    /**
     * 提取水印内容列表。上传数据中不同列可能包含不同水印，返回时将所有提取到的水印返回，列表中水印个数不超过100
     * @return watermarks
     */
    public List<String> getWatermarks() {
        return watermarks;
    }

    public void setWatermarks(List<String> watermarks) {
        this.watermarks = watermarks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDatabaseWaterMarkResponse that = (ShowDatabaseWaterMarkResponse) obj;
        return Objects.equals(this.watermarks, that.watermarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(watermarks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDatabaseWaterMarkResponse {\n");
        sb.append("    watermarks: ").append(toIndentedString(watermarks)).append("\n");
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
