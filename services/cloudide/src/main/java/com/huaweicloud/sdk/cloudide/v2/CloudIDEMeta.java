package com.huaweicloud.sdk.cloudide.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.cloudide.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class CloudIDEMeta {

    public static final HttpRequestDef<ListProjectTemplatesRequest, ListProjectTemplatesResponse> listProjectTemplates = genForlistProjectTemplates();

    private static HttpRequestDef<ListProjectTemplatesRequest, ListProjectTemplatesResponse> genForlistProjectTemplates() {
        // basic
        HttpRequestDef.Builder<ListProjectTemplatesRequest, ListProjectTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTemplatesRequest.class, ListProjectTemplatesResponse.class)
                .withUri("/v2/templates")
                .withContentType("application/json");

        // requests
        builder.withRequestField("arch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProjectTemplatesRequest::getArch, (req, v) -> {
                req.setArch(v);
            })
        );
        builder.withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListProjectTemplatesRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStacksByTagRequest, ListStacksByTagResponse> listStacksByTag = genForlistStacksByTag();

    private static HttpRequestDef<ListStacksByTagRequest, ListStacksByTagResponse> genForlistStacksByTag() {
        // basic
        HttpRequestDef.Builder<ListStacksByTagRequest, ListStacksByTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStacksByTagRequest.class, ListStacksByTagResponse.class)
                .withUri("/v2/stacks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListStacksByTagRequest::getTags, (req, v) -> {
                req.setTags(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAccountStatusRequest, ShowAccountStatusResponse> showAccountStatus = genForshowAccountStatus();

    private static HttpRequestDef<ShowAccountStatusRequest, ShowAccountStatusResponse> genForshowAccountStatus() {
        // basic
        HttpRequestDef.Builder<ShowAccountStatusRequest, ShowAccountStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAccountStatusRequest.class, ShowAccountStatusResponse.class)
                .withUri("/v2/permission/account/status")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPriceRequest, ShowPriceResponse> showPrice = genForshowPrice();

    private static HttpRequestDef<ShowPriceRequest, ShowPriceResponse> genForshowPrice() {
        // basic
        HttpRequestDef.Builder<ShowPriceRequest, ShowPriceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPriceRequest.class, ShowPriceResponse.class)
                .withUri("/v2/stacks/price")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckNameRequest, CheckNameResponse> checkName = genForcheckName();

    private static HttpRequestDef<CheckNameRequest, CheckNameResponse> genForcheckName() {
        // basic
        HttpRequestDef.Builder<CheckNameRequest, CheckNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckNameRequest.class, CheckNameResponse.class)
                .withUri("/v2/instances/duplicate")
                .withContentType("application/json");

        // requests
        builder.withRequestField("display_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckNameRequest::getDisplayName, (req, v) -> {
                req.setDisplayName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance = genForcreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForcreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withUri("/v2/{org_id}/instances")
                .withContentType("application/json");

        // requests
        builder.withRequestField("org_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateInstanceRequest::getOrgId, (req, v) -> {
                req.setOrgId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            InstanceParam.class,
            f -> f.withMarshaller(CreateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse> createInstanceBy3rd = genForcreateInstanceBy3rd();

    private static HttpRequestDef<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse> genForcreateInstanceBy3rd() {
        // basic
        HttpRequestDef.Builder<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceBy3rdRequest.class, CreateInstanceBy3rdResponse.class)
                .withUri("/v2/instances")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateInstanceBy3rdRequest::getInstanceLabel, (req, v) -> {
                req.setInstanceLabel(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            InstanceEdgeParam.class,
            f -> f.withMarshaller(CreateInstanceBy3rdRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance = genFordeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genFordeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withUri("/v2/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances = genForlistInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForlistInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withUri("/v2/instances")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("is_temporary",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListInstancesRequest::getIsTemporary, (req, v) -> {
                req.setIsTemporary(v);
            })
        );
        builder.withRequestField("label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getLabel, (req, v) -> {
                req.setLabel(v);
            })
        );
        builder.withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getSearch, (req, v) -> {
                req.setSearch(v);
            })
        );
        builder.withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            })
        );
        builder.withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInstancesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrgInstancesRequest, ListOrgInstancesResponse> listOrgInstances = genForlistOrgInstances();

    private static HttpRequestDef<ListOrgInstancesRequest, ListOrgInstancesResponse> genForlistOrgInstances() {
        // basic
        HttpRequestDef.Builder<ListOrgInstancesRequest, ListOrgInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOrgInstancesRequest.class, ListOrgInstancesResponse.class)
                .withUri("/v2/{org_id}/instances")
                .withContentType("application/json");

        // requests
        builder.withRequestField("org_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListOrgInstancesRequest::getOrgId, (req, v) -> {
                req.setOrgId(v);
            })
        );
        builder.withRequestField("is_temporary",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListOrgInstancesRequest::getIsTemporary, (req, v) -> {
                req.setIsTemporary(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListOrgInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListOrgInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOrgInstancesRequest::getSearch, (req, v) -> {
                req.setSearch(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForshowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForshowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withUri("/v2/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceRequest, StartInstanceResponse> startInstance = genForstartInstance();

    private static HttpRequestDef<StartInstanceRequest, StartInstanceResponse> genForstartInstance() {
        // basic
        HttpRequestDef.Builder<StartInstanceRequest, StartInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StartInstanceRequest.class, StartInstanceResponse.class)
                .withUri("/v2/instances/{instance_id}/runtime")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StartInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            StartInstanceParam.class,
            f -> f.withMarshaller(StartInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopInstanceRequest, StopInstanceResponse> stopInstance = genForstopInstance();

    private static HttpRequestDef<StopInstanceRequest, StopInstanceResponse> genForstopInstance() {
        // basic
        HttpRequestDef.Builder<StopInstanceRequest, StopInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, StopInstanceRequest.class, StopInstanceResponse.class)
                .withUri("/v2/instances/{instance_id}/runtime")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StopInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance = genForupdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForupdateInstance() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRequest, UpdateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceRequest.class, UpdateInstanceResponse.class)
                .withUri("/v2/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            InstanceUpdateParam.class,
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}
