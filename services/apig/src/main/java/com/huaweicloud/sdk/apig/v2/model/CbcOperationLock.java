package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CbcOperationLock
 */
public class CbcOperationLock {

    /**
     * 限制操作场景： - TO_PERIOD_LOCK：按需转包周期场景锁，不允许进行删除、规格变更、按需转包周期等 - SPEC_CHG_LOCK：包周期规格变更场景锁，不允许进行删除、规格变更等
     */
    public static final class LockSceneEnum {

        /**
         * Enum TO_PERIOD_LOCK for value: "TO_PERIOD_LOCK"
         */
        public static final LockSceneEnum TO_PERIOD_LOCK = new LockSceneEnum("TO_PERIOD_LOCK");

        /**
         * Enum PEC_CHG_LOCK for value: "PEC_CHG_LOCK"
         */
        public static final LockSceneEnum PEC_CHG_LOCK = new LockSceneEnum("PEC_CHG_LOCK");

        private static final Map<String, LockSceneEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LockSceneEnum> createStaticFields() {
            Map<String, LockSceneEnum> map = new HashMap<>();
            map.put("TO_PERIOD_LOCK", TO_PERIOD_LOCK);
            map.put("PEC_CHG_LOCK", PEC_CHG_LOCK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LockSceneEnum(String value) {
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
        public static LockSceneEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LockSceneEnum(value));
        }

        public static LockSceneEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LockSceneEnum) {
                return this.value.equals(((LockSceneEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_scene")

    private LockSceneEnum lockScene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_source_id")

    private String lockSourceId;

    public CbcOperationLock withLockScene(LockSceneEnum lockScene) {
        this.lockScene = lockScene;
        return this;
    }

    /**
     * 限制操作场景： - TO_PERIOD_LOCK：按需转包周期场景锁，不允许进行删除、规格变更、按需转包周期等 - SPEC_CHG_LOCK：包周期规格变更场景锁，不允许进行删除、规格变更等
     * @return lockScene
     */
    public LockSceneEnum getLockScene() {
        return lockScene;
    }

    public void setLockScene(LockSceneEnum lockScene) {
        this.lockScene = lockScene;
    }

    public CbcOperationLock withLockSourceId(String lockSourceId) {
        this.lockSourceId = lockSourceId;
        return this;
    }

    /**
     * 发起限制操作对象的标志
     * @return lockSourceId
     */
    public String getLockSourceId() {
        return lockSourceId;
    }

    public void setLockSourceId(String lockSourceId) {
        this.lockSourceId = lockSourceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CbcOperationLock that = (CbcOperationLock) obj;
        return Objects.equals(this.lockScene, that.lockScene) && Objects.equals(this.lockSourceId, that.lockSourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lockScene, lockSourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CbcOperationLock {\n");
        sb.append("    lockScene: ").append(toIndentedString(lockScene)).append("\n");
        sb.append("    lockSourceId: ").append(toIndentedString(lockSourceId)).append("\n");
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
