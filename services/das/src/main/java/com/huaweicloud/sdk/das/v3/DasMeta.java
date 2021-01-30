package com.huaweicloud.sdk.das.v3;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.das.v3.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class DasMeta {

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions = genForlistApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForlistApiVersions() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsRequest, ListApiVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsRequest.class, ListApiVersionsResponse.class)
                .withName("ListApiVersions")
                .withUri("/das")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion = genForshowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForshowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withName("ShowApiVersion")
                .withUri("/das/{version}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowApiVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUser = genFordeleteDbUser();

    private static HttpRequestDef<DeleteDbUserRequest, DeleteDbUserResponse> genFordeleteDbUser() {
        // basic
        HttpRequestDef.Builder<DeleteDbUserRequest, DeleteDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDbUserRequest.class, DeleteDbUserResponse.class)
                .withName("DeleteDbUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/{db_user_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("db_user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDbUserRequest::getDbUserId, (req, v) -> {
                req.setDbUserId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            DeleteDbUserRequest.XLanguageEnum.class,
            f -> f.withMarshaller(DeleteDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProcessRequest, DeleteProcessResponse> deleteProcess = genFordeleteProcess();

    private static HttpRequestDef<DeleteProcessRequest, DeleteProcessResponse> genFordeleteProcess() {
        // basic
        HttpRequestDef.Builder<DeleteProcessRequest, DeleteProcessResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProcessRequest.class, DeleteProcessResponse.class)
                .withName("DeleteProcess")
                .withUri("/v3/{project_id}/instances/{instance_id}/process")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteProcessRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            DeleteProcessRequest.XLanguageEnum.class,
            f -> f.withMarshaller(DeleteProcessRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeleteProcessReqBody.class,
            f -> f.withMarshaller(DeleteProcessRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDbUsersRequest, ListDbUsersResponse> listDbUsers = genForlistDbUsers();

    private static HttpRequestDef<ListDbUsersRequest, ListDbUsersResponse> genForlistDbUsers() {
        // basic
        HttpRequestDef.Builder<ListDbUsersRequest, ListDbUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDbUsersRequest.class, ListDbUsersResponse.class)
                .withName("ListDbUsers")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListDbUsersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDbUsersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDbUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("db_user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDbUsersRequest::getDbUserId, (req, v) -> {
                req.setDbUserId(v);
            })
        );
        builder.withRequestField("db_username",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDbUsersRequest::getDbUsername, (req, v) -> {
                req.setDbUsername(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ListDbUsersRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ListDbUsersRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInnodbLocksRequest, ListInnodbLocksResponse> listInnodbLocks = genForlistInnodbLocks();

    private static HttpRequestDef<ListInnodbLocksRequest, ListInnodbLocksResponse> genForlistInnodbLocks() {
        // basic
        HttpRequestDef.Builder<ListInnodbLocksRequest, ListInnodbLocksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInnodbLocksRequest.class, ListInnodbLocksResponse.class)
                .withName("ListInnodbLocks")
                .withUri("/v3/{project_id}/instances/{instance_id}/innodb-locks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListInnodbLocksRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("db_user_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListInnodbLocksRequest::getDbUserId, (req, v) -> {
                req.setDbUserId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ListInnodbLocksRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ListInnodbLocksRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetadataLocksRequest, ListMetadataLocksResponse> listMetadataLocks = genForlistMetadataLocks();

    private static HttpRequestDef<ListMetadataLocksRequest, ListMetadataLocksResponse> genForlistMetadataLocks() {
        // basic
        HttpRequestDef.Builder<ListMetadataLocksRequest, ListMetadataLocksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMetadataLocksRequest.class, ListMetadataLocksResponse.class)
                .withName("ListMetadataLocks")
                .withUri("/v3/{project_id}/instances/{instance_id}/metadata-locks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListMetadataLocksRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("db_user_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListMetadataLocksRequest::getDbUserId, (req, v) -> {
                req.setDbUserId(v);
            })
        );
        builder.withRequestField("thread_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMetadataLocksRequest::getThreadId, (req, v) -> {
                req.setThreadId(v);
            })
        );
        builder.withRequestField("database",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMetadataLocksRequest::getDatabase, (req, v) -> {
                req.setDatabase(v);
            })
        );
        builder.withRequestField("table",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMetadataLocksRequest::getTable, (req, v) -> {
                req.setTable(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ListMetadataLocksRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ListMetadataLocksRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProcessesRequest, ListProcessesResponse> listProcesses = genForlistProcesses();

    private static HttpRequestDef<ListProcessesRequest, ListProcessesResponse> genForlistProcesses() {
        // basic
        HttpRequestDef.Builder<ListProcessesRequest, ListProcessesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProcessesRequest.class, ListProcessesResponse.class)
                .withName("ListProcesses")
                .withUri("/v3/{project_id}/instances/{instance_id}/processes")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListProcessesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("db_user_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListProcessesRequest::getDbUserId, (req, v) -> {
                req.setDbUserId(v);
            })
        );
        builder.withRequestField("user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProcessesRequest::getUser, (req, v) -> {
                req.setUser(v);
            })
        );
        builder.withRequestField("database",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProcessesRequest::getDatabase, (req, v) -> {
                req.setDatabase(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProcessesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProcessesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ListProcessesRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ListProcessesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterDbUserRequest, RegisterDbUserResponse> registerDbUser = genForregisterDbUser();

    private static HttpRequestDef<RegisterDbUserRequest, RegisterDbUserResponse> genForregisterDbUser() {
        // basic
        HttpRequestDef.Builder<RegisterDbUserRequest, RegisterDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterDbUserRequest.class, RegisterDbUserResponse.class)
                .withName("RegisterDbUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RegisterDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            RegisterDbUserRequest.XLanguageEnum.class,
            f -> f.withMarshaller(RegisterDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RegisterDbUserRequestBody.class,
            f -> f.withMarshaller(RegisterDbUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDbUserRequest, ShowDbUserResponse> showDbUser = genForshowDbUser();

    private static HttpRequestDef<ShowDbUserRequest, ShowDbUserResponse> genForshowDbUser() {
        // basic
        HttpRequestDef.Builder<ShowDbUserRequest, ShowDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDbUserRequest.class, ShowDbUserResponse.class)
                .withName("ShowDbUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/{db_user_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("db_user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDbUserRequest::getDbUserId, (req, v) -> {
                req.setDbUserId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ShowDbUserRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ShowDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse> showSqlExecutionPlan = genForshowSqlExecutionPlan();

    private static HttpRequestDef<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse> genForshowSqlExecutionPlan() {
        // basic
        HttpRequestDef.Builder<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSqlExecutionPlanRequest.class, ShowSqlExecutionPlanResponse.class)
                .withName("ShowSqlExecutionPlan")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql/explain")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowSqlExecutionPlanRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("db_user_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowSqlExecutionPlanRequest::getDbUserId, (req, v) -> {
                req.setDbUserId(v);
            })
        );
        builder.withRequestField("database",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowSqlExecutionPlanRequest::getDatabase, (req, v) -> {
                req.setDatabase(v);
            })
        );
        builder.withRequestField("sql",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowSqlExecutionPlanRequest::getSql, (req, v) -> {
                req.setSql(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            ShowSqlExecutionPlanRequest.XLanguageEnum.class,
            f -> f.withMarshaller(ShowSqlExecutionPlanRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDbUserRequest, UpdateDbUserResponse> updateDbUser = genForupdateDbUser();

    private static HttpRequestDef<UpdateDbUserRequest, UpdateDbUserResponse> genForupdateDbUser() {
        // basic
        HttpRequestDef.Builder<UpdateDbUserRequest, UpdateDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDbUserRequest.class, UpdateDbUserResponse.class)
                .withName("UpdateDbUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/{db_user_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("db_user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDbUserRequest::getDbUserId, (req, v) -> {
                req.setDbUserId(v);
            })
        );
        builder.withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            UpdateDbUserRequest.XLanguageEnum.class,
            f -> f.withMarshaller(UpdateDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateDbUserRequestBody.class,
            f -> f.withMarshaller(UpdateDbUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}
