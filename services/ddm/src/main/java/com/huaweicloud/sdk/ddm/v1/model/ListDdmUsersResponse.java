package com.huaweicloud.sdk.ddm.v1.model;

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
public class ListDdmUsersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<GetUsersListDetailResponsesV3> users = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListDdmUsersResponse withUsers(List<GetUsersListDetailResponsesV3> users) {
        this.users = users;
        return this;
    }

    public ListDdmUsersResponse addUsersItem(GetUsersListDetailResponsesV3 usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public ListDdmUsersResponse withUsers(Consumer<List<GetUsersListDetailResponsesV3>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * **参数解释**：  DDM实例账号相关信息的集合。  **取值范围**：  不涉及
     * @return users
     */
    public List<GetUsersListDetailResponsesV3> getUsers() {
        return users;
    }

    public void setUsers(List<GetUsersListDetailResponsesV3> users) {
        this.users = users;
    }

    public ListDdmUsersResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**：  分页参数: 起始值。  **取值范围**：   大于等于0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListDdmUsersResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：  分页参数: 每页记录数。  **取值范围**：  大于0且小于等于128。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDdmUsersResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：  总记录数。  **取值范围**：  不涉及。
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
        ListDdmUsersResponse that = (ListDdmUsersResponse) obj;
        return Objects.equals(this.users, that.users) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, offset, limit, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDdmUsersResponse {\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
