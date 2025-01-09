package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowUserAccessStagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    /**
     * 接入阶段 | APP - 应用 DESKTOP - 桌面
     */
    public static final class BizTypeEnum {

        /**
         * Enum APP for value: "APP"
         */
        public static final BizTypeEnum APP = new BizTypeEnum("APP");

        /**
         * Enum DESKTOP for value: "DESKTOP"
         */
        public static final BizTypeEnum DESKTOP = new BizTypeEnum("DESKTOP");

        private static final Map<String, BizTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BizTypeEnum> createStaticFields() {
            Map<String, BizTypeEnum> map = new HashMap<>();
            map.put("APP", APP);
            map.put("DESKTOP", DESKTOP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BizTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BizTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BizTypeEnum(value));
        }

        public static BizTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BizTypeEnum) {
                return this.value.equals(((BizTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private BizTypeEnum bizType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stages")

    private List<UserAccessStage> stages = null;

    public ShowUserAccessStagesResponse withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ShowUserAccessStagesResponse withBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * 接入阶段 | APP - 应用 DESKTOP - 桌面
     * @return bizType
     */
    public BizTypeEnum getBizType() {
        return bizType;
    }

    public void setBizType(BizTypeEnum bizType) {
        this.bizType = bizType;
    }

    public ShowUserAccessStagesResponse withStages(List<UserAccessStage> stages) {
        this.stages = stages;
        return this;
    }

    public ShowUserAccessStagesResponse addStagesItem(UserAccessStage stagesItem) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        this.stages.add(stagesItem);
        return this;
    }

    public ShowUserAccessStagesResponse withStages(Consumer<List<UserAccessStage>> stagesSetter) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        stagesSetter.accept(this.stages);
        return this;
    }

    /**
     * 接入各阶段详情
     * @return stages
     */
    public List<UserAccessStage> getStages() {
        return stages;
    }

    public void setStages(List<UserAccessStage> stages) {
        this.stages = stages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUserAccessStagesResponse that = (ShowUserAccessStagesResponse) obj;
        return Objects.equals(this.username, that.username) && Objects.equals(this.bizType, that.bizType)
            && Objects.equals(this.stages, that.stages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, bizType, stages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserAccessStagesResponse {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
        sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
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
