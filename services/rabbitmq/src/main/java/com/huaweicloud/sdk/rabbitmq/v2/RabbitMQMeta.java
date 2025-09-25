package com.huaweicloud.sdk.rabbitmq.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.rabbitmq.v2.model.AMQPUser;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchCreateOrDeleteRabbitMqTagRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchCreateOrDeleteRabbitMqTagResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchCreateOrDeleteTagReq;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchDeleteBody;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchDeleteExchangesRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchDeleteExchangesResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchDeleteQueuesRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchDeleteQueuesResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchDeleteVhostsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchDeleteVhostsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchRestartOrDeleteInstanceReq;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchRestartOrDeleteInstancesRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.BatchRestartOrDeleteInstancesResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateBindingBody;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateBindingRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateBindingResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateExchangeBody;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateExchangeRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateExchangeResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateInstanceReq;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreatePostPaidInstanceByEngineRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreatePostPaidInstanceByEngineResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreatePostPaidInstanceRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreatePostPaidInstanceResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateQueueBody;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateQueueRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateQueueResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateUserRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateUserResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateVhostBody;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateVhostRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.CreateVhostResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteBackgroundTaskRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteBackgroundTaskResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteBindingRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteBindingResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteQueueInfoRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteQueueInfoResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteUserRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.DeleteUserResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListBackgroundTasksRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListBackgroundTasksResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListBindingsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListBindingsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListEngineProductsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListEngineProductsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListExchangesRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListExchangesResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListInstancesDetailsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListInstancesDetailsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListPluginsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListPluginsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListProductsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListProductsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListQueuesRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListQueuesResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListUserRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListUserResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListVhostsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListVhostsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResetPasswordReq;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResetPasswordRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResetPasswordResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResizeEngineInstanceReq;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResizeEngineInstanceRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResizeEngineInstanceResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResizeInstanceReq;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowBackgroundTaskRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowBackgroundTaskResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowCesHierarchyRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowCesHierarchyResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowEngineInstanceExtendProductInfoRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowEngineInstanceExtendProductInfoResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowInstanceExtendProductInfoRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowInstanceExtendProductInfoResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowInstanceRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowInstanceResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowMaintainWindowsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowMaintainWindowsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowQueueDetailsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowQueueDetailsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowQuotasRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowQuotasResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRabbitMqProductCoresRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRabbitMqProductCoresResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRabbitMqProjectTagsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRabbitMqProjectTagsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRabbitMqTagsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.ShowRabbitMqTagsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdateInstanceReq;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdatePluginsReq;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdatePluginsRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdatePluginsResponse;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdateUserRequest;
import com.huaweicloud.sdk.rabbitmq.v2.model.UpdateUserResponse;

@SuppressWarnings("unchecked")
public class RabbitMQMeta {

    public static final HttpRequestDef<BatchCreateOrDeleteRabbitMqTagRequest, BatchCreateOrDeleteRabbitMqTagResponse> batchCreateOrDeleteRabbitMqTag =
        genForBatchCreateOrDeleteRabbitMqTag();

    private static HttpRequestDef<BatchCreateOrDeleteRabbitMqTagRequest, BatchCreateOrDeleteRabbitMqTagResponse> genForBatchCreateOrDeleteRabbitMqTag() {
        // basic
        HttpRequestDef.Builder<BatchCreateOrDeleteRabbitMqTagRequest, BatchCreateOrDeleteRabbitMqTagResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateOrDeleteRabbitMqTagRequest.class,
                    BatchCreateOrDeleteRabbitMqTagResponse.class)
                .withName("BatchCreateOrDeleteRabbitMqTag")
                .withUri("/v2/{project_id}/rabbitmq/{instance_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateOrDeleteRabbitMqTagRequest::getInstanceId,
                BatchCreateOrDeleteRabbitMqTagRequest::setInstanceId));
        builder.<BatchCreateOrDeleteTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateOrDeleteTagReq.class),
            f -> f.withMarshaller(BatchCreateOrDeleteRabbitMqTagRequest::getBody,
                BatchCreateOrDeleteRabbitMqTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> batchRestartOrDeleteInstances =
        genForBatchRestartOrDeleteInstances();

    private static HttpRequestDef<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> genForBatchRestartOrDeleteInstances() {
        // basic
        HttpRequestDef.Builder<BatchRestartOrDeleteInstancesRequest, BatchRestartOrDeleteInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchRestartOrDeleteInstancesRequest.class,
                    BatchRestartOrDeleteInstancesResponse.class)
                .withName("BatchRestartOrDeleteInstances")
                .withUri("/v2/{project_id}/instances/action")
                .withContentType("application/json");

        // requests
        builder.<BatchRestartOrDeleteInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRestartOrDeleteInstanceReq.class),
            f -> f.withMarshaller(BatchRestartOrDeleteInstancesRequest::getBody,
                BatchRestartOrDeleteInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> createPostPaidInstance =
        genForCreatePostPaidInstance();

    private static HttpRequestDef<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> genForCreatePostPaidInstance() {
        // basic
        HttpRequestDef.Builder<CreatePostPaidInstanceRequest, CreatePostPaidInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePostPaidInstanceRequest.class, CreatePostPaidInstanceResponse.class)
            .withName("CreatePostPaidInstance")
            .withUri("/v2/{project_id}/instances")
            .withContentType("application/json");

        // requests
        builder.<CreateInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceReq.class),
            f -> f.withMarshaller(CreatePostPaidInstanceRequest::getBody, CreatePostPaidInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostPaidInstanceByEngineRequest, CreatePostPaidInstanceByEngineResponse> createPostPaidInstanceByEngine =
        genForCreatePostPaidInstanceByEngine();

    private static HttpRequestDef<CreatePostPaidInstanceByEngineRequest, CreatePostPaidInstanceByEngineResponse> genForCreatePostPaidInstanceByEngine() {
        // basic
        HttpRequestDef.Builder<CreatePostPaidInstanceByEngineRequest, CreatePostPaidInstanceByEngineResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreatePostPaidInstanceByEngineRequest.class,
                    CreatePostPaidInstanceByEngineResponse.class)
                .withName("CreatePostPaidInstanceByEngine")
                .withUri("/v2/{engine}/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<CreatePostPaidInstanceByEngineRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePostPaidInstanceByEngineRequest.EngineEnum.class),
            f -> f.withMarshaller(CreatePostPaidInstanceByEngineRequest::getEngine,
                CreatePostPaidInstanceByEngineRequest::setEngine));
        builder.<CreateInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceReq.class),
            f -> f.withMarshaller(CreatePostPaidInstanceByEngineRequest::getBody,
                CreatePostPaidInstanceByEngineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserRequest, CreateUserResponse> createUser = genForCreateUser();

    private static HttpRequestDef<CreateUserRequest, CreateUserResponse> genForCreateUser() {
        // basic
        HttpRequestDef.Builder<CreateUserRequest, CreateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUserRequest.class, CreateUserResponse.class)
                .withName("CreateUser")
                .withUri("/v2/{project_id}/instances/{instance_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUserRequest::getInstanceId, CreateUserRequest::setInstanceId));
        builder.<AMQPUser>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AMQPUser.class),
            f -> f.withMarshaller(CreateUserRequest::getBody, CreateUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> deleteBackgroundTask =
        genForDeleteBackgroundTask();

    private static HttpRequestDef<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> genForDeleteBackgroundTask() {
        // basic
        HttpRequestDef.Builder<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBackgroundTaskRequest.class, DeleteBackgroundTaskResponse.class)
            .withName("DeleteBackgroundTask")
            .withUri("/v2/{project_id}/instances/{instance_id}/tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackgroundTaskRequest::getInstanceId,
                DeleteBackgroundTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackgroundTaskRequest::getTaskId, DeleteBackgroundTaskRequest::setTaskId));

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
                .withUri("/v2/{project_id}/instances/{instance_id}")
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

    public static final HttpRequestDef<DeleteUserRequest, DeleteUserResponse> deleteUser = genForDeleteUser();

    private static HttpRequestDef<DeleteUserRequest, DeleteUserResponse> genForDeleteUser() {
        // basic
        HttpRequestDef.Builder<DeleteUserRequest, DeleteUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteUserRequest.class, DeleteUserResponse.class)
                .withName("DeleteUser")
                .withUri("/v2/{project_id}/instances/{instance_id}/users/{user_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getInstanceId, DeleteUserRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getUserName, DeleteUserRequest::setUserName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZones =
        genForListAvailableZones();

    private static HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> genForListAvailableZones() {
        // basic
        HttpRequestDef.Builder<ListAvailableZonesRequest, ListAvailableZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAvailableZonesRequest.class, ListAvailableZonesResponse.class)
                .withName("ListAvailableZones")
                .withUri("/v2/available-zones")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackgroundTasksRequest, ListBackgroundTasksResponse> listBackgroundTasks =
        genForListBackgroundTasks();

    private static HttpRequestDef<ListBackgroundTasksRequest, ListBackgroundTasksResponse> genForListBackgroundTasks() {
        // basic
        HttpRequestDef.Builder<ListBackgroundTasksRequest, ListBackgroundTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackgroundTasksRequest.class, ListBackgroundTasksResponse.class)
                .withName("ListBackgroundTasks")
                .withUri("/v2/{project_id}/instances/{instance_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getInstanceId,
                ListBackgroundTasksRequest::setInstanceId));
        builder.<Integer>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getStart, ListBackgroundTasksRequest::setStart));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getLimit, ListBackgroundTasksRequest::setLimit));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getBeginTime, ListBackgroundTasksRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackgroundTasksRequest::getEndTime, ListBackgroundTasksRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEngineProductsRequest, ListEngineProductsResponse> listEngineProducts =
        genForListEngineProducts();

    private static HttpRequestDef<ListEngineProductsRequest, ListEngineProductsResponse> genForListEngineProducts() {
        // basic
        HttpRequestDef.Builder<ListEngineProductsRequest, ListEngineProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEngineProductsRequest.class, ListEngineProductsResponse.class)
                .withName("ListEngineProducts")
                .withUri("/v2/{engine}/products")
                .withContentType("application/json");

        // requests
        builder.<ListEngineProductsRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListEngineProductsRequest.EngineEnum.class),
            f -> f.withMarshaller(ListEngineProductsRequest::getEngine, ListEngineProductsRequest::setEngine));
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineProductsRequest::getProductId, ListEngineProductsRequest::setProductId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesDetailsRequest, ListInstancesDetailsResponse> listInstancesDetails =
        genForListInstancesDetails();

    private static HttpRequestDef<ListInstancesDetailsRequest, ListInstancesDetailsResponse> genForListInstancesDetails() {
        // basic
        HttpRequestDef.Builder<ListInstancesDetailsRequest, ListInstancesDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstancesDetailsRequest.class, ListInstancesDetailsResponse.class)
            .withName("ListInstancesDetails")
            .withUri("/v2/{project_id}/instances")
            .withContentType("application/json");

        // requests
        builder.<ListInstancesDetailsRequest.EngineEnum>withRequestField("engine",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstancesDetailsRequest.EngineEnum.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getEngine, ListInstancesDetailsRequest::setEngine));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getName, ListInstancesDetailsRequest::setName));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getInstanceId,
                ListInstancesDetailsRequest::setInstanceId));
        builder.<ListInstancesDetailsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesDetailsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getStatus, ListInstancesDetailsRequest::setStatus));
        builder.<ListInstancesDetailsRequest.IncludeFailureEnum>withRequestField("include_failure",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesDetailsRequest.IncludeFailureEnum.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getIncludeFailure,
                ListInstancesDetailsRequest::setIncludeFailure));
        builder.<ListInstancesDetailsRequest.ExactMatchNameEnum>withRequestField("exact_match_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesDetailsRequest.ExactMatchNameEnum.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getExactMatchName,
                ListInstancesDetailsRequest::setExactMatchName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getEnterpriseProjectId,
                ListInstancesDetailsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getOffset, ListInstancesDetailsRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesDetailsRequest::getLimit, ListInstancesDetailsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPluginsRequest, ListPluginsResponse> listPlugins = genForListPlugins();

    private static HttpRequestDef<ListPluginsRequest, ListPluginsResponse> genForListPlugins() {
        // basic
        HttpRequestDef.Builder<ListPluginsRequest, ListPluginsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPluginsRequest.class, ListPluginsResponse.class)
                .withName("ListPlugins")
                .withUri("/v2/{project_id}/instances/{instance_id}/rabbitmq/plugins")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPluginsRequest::getInstanceId, ListPluginsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductsRequest, ListProductsResponse> listProducts = genForListProducts();

    private static HttpRequestDef<ListProductsRequest, ListProductsResponse> genForListProducts() {
        // basic
        HttpRequestDef.Builder<ListProductsRequest, ListProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductsRequest.class, ListProductsResponse.class)
                .withName("ListProducts")
                .withUri("/v2/products")
                .withContentType("application/json");

        // requests
        builder.<ListProductsRequest.EngineEnum>withRequestField("engine",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProductsRequest.EngineEnum.class),
            f -> f.withMarshaller(ListProductsRequest::getEngine, ListProductsRequest::setEngine));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserRequest, ListUserResponse> listUser = genForListUser();

    private static HttpRequestDef<ListUserRequest, ListUserResponse> genForListUser() {
        // basic
        HttpRequestDef.Builder<ListUserRequest, ListUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserRequest.class, ListUserResponse.class)
                .withName("ListUser")
                .withUri("/v2/{project_id}/instances/{instance_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserRequest::getInstanceId, ListUserRequest::setInstanceId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserRequest::getOffset, ListUserRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserRequest::getLimit, ListUserRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword =
        genForResetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForResetPassword() {
        // basic
        HttpRequestDef.Builder<ResetPasswordRequest, ResetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetPasswordRequest.class, ResetPasswordResponse.class)
                .withName("ResetPassword")
                .withUri("/v2/{project_id}/instances/{instance_id}/password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPasswordRequest::getInstanceId, ResetPasswordRequest::setInstanceId));
        builder.<ResetPasswordReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPasswordReq.class),
            f -> f.withMarshaller(ResetPasswordRequest::getBody, ResetPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse> resizeEngineInstance =
        genForResizeEngineInstance();

    private static HttpRequestDef<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse> genForResizeEngineInstance() {
        // basic
        HttpRequestDef.Builder<ResizeEngineInstanceRequest, ResizeEngineInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ResizeEngineInstanceRequest.class, ResizeEngineInstanceResponse.class)
            .withName("ResizeEngineInstance")
            .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/extend")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeEngineInstanceRequest::getInstanceId,
                ResizeEngineInstanceRequest::setInstanceId));
        builder.<ResizeEngineInstanceRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeEngineInstanceRequest.EngineEnum.class),
            f -> f.withMarshaller(ResizeEngineInstanceRequest::getEngine, ResizeEngineInstanceRequest::setEngine));
        builder.<ResizeEngineInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeEngineInstanceReq.class),
            f -> f.withMarshaller(ResizeEngineInstanceRequest::getBody, ResizeEngineInstanceRequest::setBody));

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
                .withUri("/v2/{project_id}/instances/{instance_id}/extend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getInstanceId, ResizeInstanceRequest::setInstanceId));
        builder.<ResizeInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeInstanceReq.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getBody, ResizeInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> showBackgroundTask =
        genForShowBackgroundTask();

    private static HttpRequestDef<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> genForShowBackgroundTask() {
        // basic
        HttpRequestDef.Builder<ShowBackgroundTaskRequest, ShowBackgroundTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackgroundTaskRequest.class, ShowBackgroundTaskResponse.class)
                .withName("ShowBackgroundTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackgroundTaskRequest::getInstanceId, ShowBackgroundTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackgroundTaskRequest::getTaskId, ShowBackgroundTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCesHierarchyRequest, ShowCesHierarchyResponse> showCesHierarchy =
        genForShowCesHierarchy();

    private static HttpRequestDef<ShowCesHierarchyRequest, ShowCesHierarchyResponse> genForShowCesHierarchy() {
        // basic
        HttpRequestDef.Builder<ShowCesHierarchyRequest, ShowCesHierarchyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCesHierarchyRequest.class, ShowCesHierarchyResponse.class)
                .withName("ShowCesHierarchy")
                .withUri("/v2/{project_id}/instances/{instance_id}/ces-hierarchy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCesHierarchyRequest::getInstanceId, ShowCesHierarchyRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> showEngineInstanceExtendProductInfo =
        genForShowEngineInstanceExtendProductInfo();

    private static HttpRequestDef<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> genForShowEngineInstanceExtendProductInfo() {
        // basic
        HttpRequestDef.Builder<ShowEngineInstanceExtendProductInfoRequest, ShowEngineInstanceExtendProductInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowEngineInstanceExtendProductInfoRequest.class,
                    ShowEngineInstanceExtendProductInfoResponse.class)
                .withName("ShowEngineInstanceExtendProductInfo")
                .withUri("/v2/{engine}/{project_id}/instances/{instance_id}/extend")
                .withContentType("application/json");

        // requests
        builder.<ShowEngineInstanceExtendProductInfoRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowEngineInstanceExtendProductInfoRequest.EngineEnum.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoRequest::getEngine,
                ShowEngineInstanceExtendProductInfoRequest::setEngine));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoRequest::getInstanceId,
                ShowEngineInstanceExtendProductInfoRequest::setInstanceId));
        builder.<ShowEngineInstanceExtendProductInfoRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowEngineInstanceExtendProductInfoRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowEngineInstanceExtendProductInfoRequest::getType,
                ShowEngineInstanceExtendProductInfoRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForShowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForShowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}")
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

    public static final HttpRequestDef<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> showInstanceExtendProductInfo =
        genForShowInstanceExtendProductInfo();

    private static HttpRequestDef<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> genForShowInstanceExtendProductInfo() {
        // basic
        HttpRequestDef.Builder<ShowInstanceExtendProductInfoRequest, ShowInstanceExtendProductInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceExtendProductInfoRequest.class,
                    ShowInstanceExtendProductInfoResponse.class)
                .withName("ShowInstanceExtendProductInfo")
                .withUri("/v2/{project_id}/instances/{instance_id}/extend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceExtendProductInfoRequest::getInstanceId,
                ShowInstanceExtendProductInfoRequest::setInstanceId));
        builder.<ShowInstanceExtendProductInfoRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowInstanceExtendProductInfoRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowInstanceExtendProductInfoRequest::getType,
                ShowInstanceExtendProductInfoRequest::setType));
        builder.<ShowInstanceExtendProductInfoRequest.EngineEnum>withRequestField("engine",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowInstanceExtendProductInfoRequest.EngineEnum.class),
            f -> f.withMarshaller(ShowInstanceExtendProductInfoRequest::getEngine,
                ShowInstanceExtendProductInfoRequest::setEngine));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> showMaintainWindows =
        genForShowMaintainWindows();

    private static HttpRequestDef<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> genForShowMaintainWindows() {
        // basic
        HttpRequestDef.Builder<ShowMaintainWindowsRequest, ShowMaintainWindowsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMaintainWindowsRequest.class, ShowMaintainWindowsResponse.class)
                .withName("ShowMaintainWindows")
                .withUri("/v2/instances/maintain-windows")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForShowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForShowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/v2/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRabbitMqProductCoresRequest, ShowRabbitMqProductCoresResponse> showRabbitMqProductCores =
        genForShowRabbitMqProductCores();

    private static HttpRequestDef<ShowRabbitMqProductCoresRequest, ShowRabbitMqProductCoresResponse> genForShowRabbitMqProductCores() {
        // basic
        HttpRequestDef.Builder<ShowRabbitMqProductCoresRequest, ShowRabbitMqProductCoresResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowRabbitMqProductCoresRequest.class, ShowRabbitMqProductCoresResponse.class)
                .withName("ShowRabbitMqProductCores")
                .withUri("/v2/rabbitmq/products/cores")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRabbitMqProductCoresRequest::getInstanceId,
                ShowRabbitMqProductCoresRequest::setInstanceId));
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRabbitMqProductCoresRequest::getProductId,
                ShowRabbitMqProductCoresRequest::setProductId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRabbitMqProjectTagsRequest, ShowRabbitMqProjectTagsResponse> showRabbitMqProjectTags =
        genForShowRabbitMqProjectTags();

    private static HttpRequestDef<ShowRabbitMqProjectTagsRequest, ShowRabbitMqProjectTagsResponse> genForShowRabbitMqProjectTags() {
        // basic
        HttpRequestDef.Builder<ShowRabbitMqProjectTagsRequest, ShowRabbitMqProjectTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRabbitMqProjectTagsRequest.class, ShowRabbitMqProjectTagsResponse.class)
            .withName("ShowRabbitMqProjectTags")
            .withUri("/v2/{project_id}/rabbitmq/tags")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRabbitMqTagsRequest, ShowRabbitMqTagsResponse> showRabbitMqTags =
        genForShowRabbitMqTags();

    private static HttpRequestDef<ShowRabbitMqTagsRequest, ShowRabbitMqTagsResponse> genForShowRabbitMqTags() {
        // basic
        HttpRequestDef.Builder<ShowRabbitMqTagsRequest, ShowRabbitMqTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRabbitMqTagsRequest.class, ShowRabbitMqTagsResponse.class)
                .withName("ShowRabbitMqTags")
                .withUri("/v2/{project_id}/rabbitmq/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRabbitMqTagsRequest::getInstanceId, ShowRabbitMqTagsRequest::setInstanceId));

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
                .withUri("/v2/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getInstanceId, UpdateInstanceRequest::setInstanceId));
        builder.<UpdateInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceReq.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, UpdateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePluginsRequest, UpdatePluginsResponse> updatePlugins =
        genForUpdatePlugins();

    private static HttpRequestDef<UpdatePluginsRequest, UpdatePluginsResponse> genForUpdatePlugins() {
        // basic
        HttpRequestDef.Builder<UpdatePluginsRequest, UpdatePluginsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePluginsRequest.class, UpdatePluginsResponse.class)
                .withName("UpdatePlugins")
                .withUri("/v2/{project_id}/instances/{instance_id}/rabbitmq/plugins")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePluginsRequest::getInstanceId, UpdatePluginsRequest::setInstanceId));
        builder.<UpdatePluginsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePluginsReq.class),
            f -> f.withMarshaller(UpdatePluginsRequest::getBody, UpdatePluginsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRequest, UpdateUserResponse> updateUser = genForUpdateUser();

    private static HttpRequestDef<UpdateUserRequest, UpdateUserResponse> genForUpdateUser() {
        // basic
        HttpRequestDef.Builder<UpdateUserRequest, UpdateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserRequest.class, UpdateUserResponse.class)
                .withName("UpdateUser")
                .withUri("/v2/{project_id}/instances/{instance_id}/users/{user_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getInstanceId, UpdateUserRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getUserName, UpdateUserRequest::setUserName));
        builder.<AMQPUser>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AMQPUser.class),
            f -> f.withMarshaller(UpdateUserRequest::getBody, UpdateUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBindingRequest, CreateBindingResponse> createBinding =
        genForCreateBinding();

    private static HttpRequestDef<CreateBindingRequest, CreateBindingResponse> genForCreateBinding() {
        // basic
        HttpRequestDef.Builder<CreateBindingRequest, CreateBindingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBindingRequest.class, CreateBindingResponse.class)
                .withName("CreateBinding")
                .withUri(
                    "/v2/rabbitmq/{project_id}/instances/{instance_id}/vhosts/{vhost}/exchanges/{exchange}/binding")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBindingRequest::getInstanceId, CreateBindingRequest::setInstanceId));
        builder.<String>withRequestField("vhost",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBindingRequest::getVhost, CreateBindingRequest::setVhost));
        builder.<String>withRequestField("exchange",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBindingRequest::getExchange, CreateBindingRequest::setExchange));
        builder.<CreateBindingBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBindingBody.class),
            f -> f.withMarshaller(CreateBindingRequest::getBody, CreateBindingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBindingRequest, DeleteBindingResponse> deleteBinding =
        genForDeleteBinding();

    private static HttpRequestDef<DeleteBindingRequest, DeleteBindingResponse> genForDeleteBinding() {
        // basic
        HttpRequestDef.Builder<DeleteBindingRequest, DeleteBindingResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBindingRequest.class, DeleteBindingResponse.class)
            .withName("DeleteBinding")
            .withUri(
                "/v2/rabbitmq/{project_id}/instances/{instance_id}/vhosts/{vhost}/exchanges/{exchange}/destination-type/{destination_type}/destination/{destination}/properties-key/{properties_key}/unbinding")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBindingRequest::getInstanceId, DeleteBindingRequest::setInstanceId));
        builder.<String>withRequestField("vhost",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBindingRequest::getVhost, DeleteBindingRequest::setVhost));
        builder.<String>withRequestField("exchange",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBindingRequest::getExchange, DeleteBindingRequest::setExchange));
        builder.<String>withRequestField("destination_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBindingRequest::getDestinationType, DeleteBindingRequest::setDestinationType));
        builder.<String>withRequestField("destination",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBindingRequest::getDestination, DeleteBindingRequest::setDestination));
        builder.<String>withRequestField("properties_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBindingRequest::getPropertiesKey, DeleteBindingRequest::setPropertiesKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBindingsRequest, ListBindingsResponse> listBindings = genForListBindings();

    private static HttpRequestDef<ListBindingsRequest, ListBindingsResponse> genForListBindings() {
        // basic
        HttpRequestDef.Builder<ListBindingsRequest, ListBindingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBindingsRequest.class, ListBindingsResponse.class)
                .withName("ListBindings")
                .withUri(
                    "/v2/rabbitmq/{project_id}/instances/{instance_id}/vhosts/{vhost}/exchanges/{exchange}/binding")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBindingsRequest::getInstanceId, ListBindingsRequest::setInstanceId));
        builder.<String>withRequestField("vhost",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBindingsRequest::getVhost, ListBindingsRequest::setVhost));
        builder.<String>withRequestField("exchange",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBindingsRequest::getExchange, ListBindingsRequest::setExchange));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteExchangesRequest, BatchDeleteExchangesResponse> batchDeleteExchanges =
        genForBatchDeleteExchanges();

    private static HttpRequestDef<BatchDeleteExchangesRequest, BatchDeleteExchangesResponse> genForBatchDeleteExchanges() {
        // basic
        HttpRequestDef.Builder<BatchDeleteExchangesRequest, BatchDeleteExchangesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteExchangesRequest.class, BatchDeleteExchangesResponse.class)
            .withName("BatchDeleteExchanges")
            .withUri("/v2/rabbitmq/{project_id}/instances/{instance_id}/vhosts/{vhost}/exchanges")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteExchangesRequest::getInstanceId,
                BatchDeleteExchangesRequest::setInstanceId));
        builder.<String>withRequestField("vhost",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteExchangesRequest::getVhost, BatchDeleteExchangesRequest::setVhost));
        builder.<BatchDeleteBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteBody.class),
            f -> f.withMarshaller(BatchDeleteExchangesRequest::getBody, BatchDeleteExchangesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateExchangeRequest, CreateExchangeResponse> createExchange =
        genForCreateExchange();

    private static HttpRequestDef<CreateExchangeRequest, CreateExchangeResponse> genForCreateExchange() {
        // basic
        HttpRequestDef.Builder<CreateExchangeRequest, CreateExchangeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateExchangeRequest.class, CreateExchangeResponse.class)
                .withName("CreateExchange")
                .withUri("/v2/rabbitmq/{project_id}/instances/{instance_id}/vhosts/{vhost}/exchanges")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateExchangeRequest::getInstanceId, CreateExchangeRequest::setInstanceId));
        builder.<String>withRequestField("vhost",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateExchangeRequest::getVhost, CreateExchangeRequest::setVhost));
        builder.<CreateExchangeBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateExchangeBody.class),
            f -> f.withMarshaller(CreateExchangeRequest::getBody, CreateExchangeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExchangesRequest, ListExchangesResponse> listExchanges =
        genForListExchanges();

    private static HttpRequestDef<ListExchangesRequest, ListExchangesResponse> genForListExchanges() {
        // basic
        HttpRequestDef.Builder<ListExchangesRequest, ListExchangesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListExchangesRequest.class, ListExchangesResponse.class)
                .withName("ListExchanges")
                .withUri("/v2/rabbitmq/{project_id}/instances/{instance_id}/vhosts/{vhost}/exchanges")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExchangesRequest::getInstanceId, ListExchangesRequest::setInstanceId));
        builder.<String>withRequestField("vhost",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExchangesRequest::getVhost, ListExchangesRequest::setVhost));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExchangesRequest::getOffset, ListExchangesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExchangesRequest::getLimit, ListExchangesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteQueuesRequest, BatchDeleteQueuesResponse> batchDeleteQueues =
        genForBatchDeleteQueues();

    private static HttpRequestDef<BatchDeleteQueuesRequest, BatchDeleteQueuesResponse> genForBatchDeleteQueues() {
        // basic
        HttpRequestDef.Builder<BatchDeleteQueuesRequest, BatchDeleteQueuesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteQueuesRequest.class, BatchDeleteQueuesResponse.class)
                .withName("BatchDeleteQueues")
                .withUri("/v2/rabbitmq/{project_id}/instances/{instance_id}/vhosts/{vhost}/queues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteQueuesRequest::getInstanceId, BatchDeleteQueuesRequest::setInstanceId));
        builder.<String>withRequestField("vhost",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteQueuesRequest::getVhost, BatchDeleteQueuesRequest::setVhost));
        builder.<BatchDeleteBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteBody.class),
            f -> f.withMarshaller(BatchDeleteQueuesRequest::getBody, BatchDeleteQueuesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQueueRequest, CreateQueueResponse> createQueue = genForCreateQueue();

    private static HttpRequestDef<CreateQueueRequest, CreateQueueResponse> genForCreateQueue() {
        // basic
        HttpRequestDef.Builder<CreateQueueRequest, CreateQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateQueueRequest.class, CreateQueueResponse.class)
                .withName("CreateQueue")
                .withUri("/v2/rabbitmq/{project_id}/instances/{instance_id}/vhosts/{vhost}/queues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQueueRequest::getInstanceId, CreateQueueRequest::setInstanceId));
        builder.<String>withRequestField("vhost",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQueueRequest::getVhost, CreateQueueRequest::setVhost));
        builder.<CreateQueueBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateQueueBody.class),
            f -> f.withMarshaller(CreateQueueRequest::getBody, CreateQueueRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteQueueInfoRequest, DeleteQueueInfoResponse> deleteQueueInfo =
        genForDeleteQueueInfo();

    private static HttpRequestDef<DeleteQueueInfoRequest, DeleteQueueInfoResponse> genForDeleteQueueInfo() {
        // basic
        HttpRequestDef.Builder<DeleteQueueInfoRequest, DeleteQueueInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteQueueInfoRequest.class, DeleteQueueInfoResponse.class)
                .withName("DeleteQueueInfo")
                .withUri("/v2/rabbitmq/{project_id}/instances/{instance_id}/vhosts/{vhost}/queues/{queue}/contents")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteQueueInfoRequest::getInstanceId, DeleteQueueInfoRequest::setInstanceId));
        builder.<String>withRequestField("vhost",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteQueueInfoRequest::getVhost, DeleteQueueInfoRequest::setVhost));
        builder.<String>withRequestField("queue",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteQueueInfoRequest::getQueue, DeleteQueueInfoRequest::setQueue));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueuesRequest, ListQueuesResponse> listQueues = genForListQueues();

    private static HttpRequestDef<ListQueuesRequest, ListQueuesResponse> genForListQueues() {
        // basic
        HttpRequestDef.Builder<ListQueuesRequest, ListQueuesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQueuesRequest.class, ListQueuesResponse.class)
                .withName("ListQueues")
                .withUri("/v2/rabbitmq/{project_id}/instances/{instance_id}/vhosts/{vhost}/queues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueuesRequest::getInstanceId, ListQueuesRequest::setInstanceId));
        builder.<String>withRequestField("vhost",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueuesRequest::getVhost, ListQueuesRequest::setVhost));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueuesRequest::getOffset, ListQueuesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueuesRequest::getLimit, ListQueuesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQueueDetailsRequest, ShowQueueDetailsResponse> showQueueDetails =
        genForShowQueueDetails();

    private static HttpRequestDef<ShowQueueDetailsRequest, ShowQueueDetailsResponse> genForShowQueueDetails() {
        // basic
        HttpRequestDef.Builder<ShowQueueDetailsRequest, ShowQueueDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQueueDetailsRequest.class, ShowQueueDetailsResponse.class)
                .withName("ShowQueueDetails")
                .withUri("/v2/rabbitmq/{project_id}/instances/{instance_id}/vhosts/{vhost}/queues/{queue}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQueueDetailsRequest::getInstanceId, ShowQueueDetailsRequest::setInstanceId));
        builder.<String>withRequestField("vhost",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQueueDetailsRequest::getVhost, ShowQueueDetailsRequest::setVhost));
        builder.<String>withRequestField("queue",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQueueDetailsRequest::getQueue, ShowQueueDetailsRequest::setQueue));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteVhostsRequest, BatchDeleteVhostsResponse> batchDeleteVhosts =
        genForBatchDeleteVhosts();

    private static HttpRequestDef<BatchDeleteVhostsRequest, BatchDeleteVhostsResponse> genForBatchDeleteVhosts() {
        // basic
        HttpRequestDef.Builder<BatchDeleteVhostsRequest, BatchDeleteVhostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteVhostsRequest.class, BatchDeleteVhostsResponse.class)
                .withName("BatchDeleteVhosts")
                .withUri("/v2/rabbitmq/{project_id}/instances/{instance_id}/vhosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteVhostsRequest::getInstanceId, BatchDeleteVhostsRequest::setInstanceId));
        builder.<BatchDeleteBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteBody.class),
            f -> f.withMarshaller(BatchDeleteVhostsRequest::getBody, BatchDeleteVhostsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVhostRequest, CreateVhostResponse> createVhost = genForCreateVhost();

    private static HttpRequestDef<CreateVhostRequest, CreateVhostResponse> genForCreateVhost() {
        // basic
        HttpRequestDef.Builder<CreateVhostRequest, CreateVhostResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateVhostRequest.class, CreateVhostResponse.class)
                .withName("CreateVhost")
                .withUri("/v2/rabbitmq/{project_id}/instances/{instance_id}/vhosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVhostRequest::getInstanceId, CreateVhostRequest::setInstanceId));
        builder.<CreateVhostBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVhostBody.class),
            f -> f.withMarshaller(CreateVhostRequest::getBody, CreateVhostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVhostsRequest, ListVhostsResponse> listVhosts = genForListVhosts();

    private static HttpRequestDef<ListVhostsRequest, ListVhostsResponse> genForListVhosts() {
        // basic
        HttpRequestDef.Builder<ListVhostsRequest, ListVhostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVhostsRequest.class, ListVhostsResponse.class)
                .withName("ListVhosts")
                .withUri("/v2/rabbitmq/{project_id}/instances/{instance_id}/vhosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVhostsRequest::getInstanceId, ListVhostsRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVhostsRequest::getOffset, ListVhostsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVhostsRequest::getLimit, ListVhostsRequest::setLimit));

        // response

        return builder.build();
    }

}
