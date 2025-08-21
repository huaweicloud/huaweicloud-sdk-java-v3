package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchCreateRepositoryMemberDto
 */
public class BatchCreateRepositoryMemberDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<CreateRepositoryMemberResponseDto> result = null;

    public BatchCreateRepositoryMemberDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 批量添加是否成功 **约束限制：** - success，全部添加成功。 - error，未全部添加成功。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BatchCreateRepositoryMemberDto withResult(List<CreateRepositoryMemberResponseDto> result) {
        this.result = result;
        return this;
    }

    public BatchCreateRepositoryMemberDto addResultItem(CreateRepositoryMemberResponseDto resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public BatchCreateRepositoryMemberDto withResult(Consumer<List<CreateRepositoryMemberResponseDto>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * **参数解释：** 批量添加结果详情。 **约束限制：** 不涉及。
     * @return result
     */
    public List<CreateRepositoryMemberResponseDto> getResult() {
        return result;
    }

    public void setResult(List<CreateRepositoryMemberResponseDto> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateRepositoryMemberDto that = (BatchCreateRepositoryMemberDto) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateRepositoryMemberDto {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
