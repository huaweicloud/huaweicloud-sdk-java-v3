package com.huaweicloud.sdk.iotdm.v5;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.iotdm.v5.model.BindInstanceTags;
import com.huaweicloud.sdk.iotdm.v5.model.BindInstanceTagsRequest;
import com.huaweicloud.sdk.iotdm.v5.model.BindInstanceTagsResponse;
import com.huaweicloud.sdk.iotdm.v5.model.ChangeInstanceChargeMode;
import com.huaweicloud.sdk.iotdm.v5.model.ChangeInstanceChargeModeRequest;
import com.huaweicloud.sdk.iotdm.v5.model.ChangeInstanceChargeModeResponse;
import com.huaweicloud.sdk.iotdm.v5.model.CreateInstance;
import com.huaweicloud.sdk.iotdm.v5.model.CreateInstanceRequest;
import com.huaweicloud.sdk.iotdm.v5.model.CreateInstanceResponse;
import com.huaweicloud.sdk.iotdm.v5.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.iotdm.v5.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.iotdm.v5.model.ListInstancesRequest;
import com.huaweicloud.sdk.iotdm.v5.model.ListInstancesResponse;
import com.huaweicloud.sdk.iotdm.v5.model.ResizeInstance;
import com.huaweicloud.sdk.iotdm.v5.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.iotdm.v5.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.iotdm.v5.model.ShowInstanceRequest;
import com.huaweicloud.sdk.iotdm.v5.model.ShowInstanceResponse;
import com.huaweicloud.sdk.iotdm.v5.model.UnbindInstanceTags;
import com.huaweicloud.sdk.iotdm.v5.model.UnbindInstanceTagsRequest;
import com.huaweicloud.sdk.iotdm.v5.model.UnbindInstanceTagsResponse;
import com.huaweicloud.sdk.iotdm.v5.model.UpdateInstance;
import com.huaweicloud.sdk.iotdm.v5.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.iotdm.v5.model.UpdateInstanceResponse;

@SuppressWarnings("unchecked")
public class IoTDMMeta {

    public static final HttpRequestDef<BindInstanceTagsRequest, BindInstanceTagsResponse> bindInstanceTags =
        genForBindInstanceTags();

    private static HttpRequestDef<BindInstanceTagsRequest, BindInstanceTagsResponse> genForBindInstanceTags() {
        // basic
        HttpRequestDef.Builder<BindInstanceTagsRequest, BindInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BindInstanceTagsRequest.class, BindInstanceTagsResponse.class)
                .withName("BindInstanceTags")
                .withUri("/v5/iot/{project_id}/iotda-instances/{instance_id}/bind-tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BindInstanceTagsRequest::getInstanceId, BindInstanceTagsRequest::setInstanceId));
        builder.<BindInstanceTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BindInstanceTags.class),
            f -> f.withMarshaller(BindInstanceTagsRequest::getBody, BindInstanceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeInstanceChargeModeRequest, ChangeInstanceChargeModeResponse> changeInstanceChargeMode =
        genForChangeInstanceChargeMode();

    private static HttpRequestDef<ChangeInstanceChargeModeRequest, ChangeInstanceChargeModeResponse> genForChangeInstanceChargeMode() {
        // basic
        HttpRequestDef.Builder<ChangeInstanceChargeModeRequest, ChangeInstanceChargeModeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ChangeInstanceChargeModeRequest.class, ChangeInstanceChargeModeResponse.class)
                .withName("ChangeInstanceChargeMode")
                .withUri("/v5/iot/{project_id}/iotda-instances/{instance_id}/change-charge-mode")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeInstanceChargeModeRequest::getInstanceId,
                ChangeInstanceChargeModeRequest::setInstanceId));
        builder.<ChangeInstanceChargeMode>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeInstanceChargeMode.class),
            f -> f.withMarshaller(ChangeInstanceChargeModeRequest::getBody, ChangeInstanceChargeModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForCreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForCreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v5/iot/{project_id}/iotda-instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateInstance>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstance.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, CreateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genForDeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genForDeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v5/iot/{project_id}/iotda-instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, DeleteInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForListInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForListInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v5/iot/{project_id}/iotda-instances")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, ListInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, ListInstancesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getMarker, ListInstancesRequest::setMarker));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getName, ListInstancesRequest::setName));
        builder.<String>withRequestField("instance_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getInstanceType, ListInstancesRequest::setInstanceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstance =
        genForResizeInstance();

    private static HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> genForResizeInstance() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceRequest, ResizeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeInstanceRequest.class, ResizeInstanceResponse.class)
                .withName("ResizeInstance")
                .withUri("/v5/iot/{project_id}/iotda-instances/{instance_id}/resize")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getInstanceId, ResizeInstanceRequest::setInstanceId));
        builder.<ResizeInstance>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeInstance.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getBody, ResizeInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForShowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForShowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v5/iot/{project_id}/iotda-instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, ShowInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnbindInstanceTagsRequest, UnbindInstanceTagsResponse> unbindInstanceTags =
        genForUnbindInstanceTags();

    private static HttpRequestDef<UnbindInstanceTagsRequest, UnbindInstanceTagsResponse> genForUnbindInstanceTags() {
        // basic
        HttpRequestDef.Builder<UnbindInstanceTagsRequest, UnbindInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnbindInstanceTagsRequest.class, UnbindInstanceTagsResponse.class)
                .withName("UnbindInstanceTags")
                .withUri("/v5/iot/{project_id}/iotda-instances/{instance_id}/unbind-tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnbindInstanceTagsRequest::getInstanceId, UnbindInstanceTagsRequest::setInstanceId));
        builder.<UnbindInstanceTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnbindInstanceTags.class),
            f -> f.withMarshaller(UnbindInstanceTagsRequest::getBody, UnbindInstanceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance =
        genForUpdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForUpdateInstance() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRequest, UpdateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceRequest.class, UpdateInstanceResponse.class)
                .withName("UpdateInstance")
                .withUri("/v5/iot/{project_id}/iotda-instances/{instance_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getInstanceId, UpdateInstanceRequest::setInstanceId));
        builder.<UpdateInstance>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstance.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, UpdateInstanceRequest::setBody));

        // response

        return builder.build();
    }

}
