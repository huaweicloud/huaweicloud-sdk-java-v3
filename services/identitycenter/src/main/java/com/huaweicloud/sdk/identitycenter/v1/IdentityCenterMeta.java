package com.huaweicloud.sdk.identitycenter.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedPolicyToPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedPolicyToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedPolicyToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedRoleToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedRoleToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAccountAssignmentReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAccountAssignmentRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAccountAssignmentResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateInstanceAccessControlAttributeConfigurationReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateInstanceAccessControlAttributeConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateInstanceAccessControlAttributeConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateTagResourceRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateTagResourceResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteCustomPolicyFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteCustomPolicyFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteCustomRoleFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteCustomRoleFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteInstanceAccessControlAttributeConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteInstanceAccessControlAttributeConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeletePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeletePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteTagResourceReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteTagResourceRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteTagResourceResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentCreationStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentCreationStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentDeletionStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentDeletionStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeInstanceAccessControlAttributeConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeInstanceAccessControlAttributeConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetProvisioningStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetProvisioningStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedRoleFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedRoleFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetCustomPolicyForPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetCustomPolicyForPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetCustomRoleForPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetCustomRoleForPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentCreationStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentCreationStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentDeletionStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentDeletionStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountsForProvisionedPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountsForProvisionedPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListInstancesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedPoliciesInPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedPoliciesInPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedRolesInPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedRolesInPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetProvisioningStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetProvisioningStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsProvisionedToAccountRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsProvisionedToAccountResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListTagResourcesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListTagResourcesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ProvisionPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.ProvisionPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ProvisionPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomPolicyToPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomPolicyToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomPolicyToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomRoleToPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomRoleToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomRoleToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ResourceAttachManagedPolicyToPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.ResourceDetachManagedPolicyFromPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.TagResourceReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateInstanceAccessControlAttributeConfigurationReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateInstanceAccessControlAttributeConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateInstanceAccessControlAttributeConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdatePermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdatePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdatePermissionSetResponse;

@SuppressWarnings("unchecked")
public class IdentityCenterMeta {

    public static final HttpRequestDef<CreateAccountAssignmentRequest, CreateAccountAssignmentResponse> createAccountAssignment =
        genForCreateAccountAssignment();

    private static HttpRequestDef<CreateAccountAssignmentRequest, CreateAccountAssignmentResponse> genForCreateAccountAssignment() {
        // basic
        HttpRequestDef.Builder<CreateAccountAssignmentRequest, CreateAccountAssignmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAccountAssignmentRequest.class, CreateAccountAssignmentResponse.class)
            .withName("CreateAccountAssignment")
            .withUri("/v1/instances/{instance_id}/account-assignments/create")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccountAssignmentRequest::getInstanceId,
                CreateAccountAssignmentRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccountAssignmentRequest::getXSecurityToken,
                CreateAccountAssignmentRequest::setXSecurityToken));
        builder.<CreateAccountAssignmentReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAccountAssignmentReqBody.class),
            f -> f.withMarshaller(CreateAccountAssignmentRequest::getBody, CreateAccountAssignmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResponse> deleteAccountAssignment =
        genForDeleteAccountAssignment();

    private static HttpRequestDef<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResponse> genForDeleteAccountAssignment() {
        // basic
        HttpRequestDef.Builder<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteAccountAssignmentRequest.class, DeleteAccountAssignmentResponse.class)
            .withName("DeleteAccountAssignment")
            .withUri("/v1/instances/{instance_id}/account-assignments/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccountAssignmentRequest::getInstanceId,
                DeleteAccountAssignmentRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccountAssignmentRequest::getXSecurityToken,
                DeleteAccountAssignmentRequest::setXSecurityToken));
        builder.<DeleteAccountAssignmentReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAccountAssignmentReqBody.class),
            f -> f.withMarshaller(DeleteAccountAssignmentRequest::getBody, DeleteAccountAssignmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResponse> describeAccountAssignmentCreationStatus =
        genForDescribeAccountAssignmentCreationStatus();

    private static HttpRequestDef<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResponse> genForDescribeAccountAssignmentCreationStatus() {
        // basic
        HttpRequestDef.Builder<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DescribeAccountAssignmentCreationStatusRequest.class,
                    DescribeAccountAssignmentCreationStatusResponse.class)
                .withName("DescribeAccountAssignmentCreationStatus")
                .withUri("/v1/instances/{instance_id}/account-assignments/creation-status/{request_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeAccountAssignmentCreationStatusRequest::getInstanceId,
                DescribeAccountAssignmentCreationStatusRequest::setInstanceId));
        builder.<String>withRequestField("request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeAccountAssignmentCreationStatusRequest::getRequestId,
                DescribeAccountAssignmentCreationStatusRequest::setRequestId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeAccountAssignmentCreationStatusRequest::getXSecurityToken,
                DescribeAccountAssignmentCreationStatusRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResponse> describeAccountAssignmentDeletionStatus =
        genForDescribeAccountAssignmentDeletionStatus();

    private static HttpRequestDef<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResponse> genForDescribeAccountAssignmentDeletionStatus() {
        // basic
        HttpRequestDef.Builder<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DescribeAccountAssignmentDeletionStatusRequest.class,
                    DescribeAccountAssignmentDeletionStatusResponse.class)
                .withName("DescribeAccountAssignmentDeletionStatus")
                .withUri("/v1/instances/{instance_id}/account-assignments/deletion-status/{request_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeAccountAssignmentDeletionStatusRequest::getInstanceId,
                DescribeAccountAssignmentDeletionStatusRequest::setInstanceId));
        builder.<String>withRequestField("request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeAccountAssignmentDeletionStatusRequest::getRequestId,
                DescribeAccountAssignmentDeletionStatusRequest::setRequestId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeAccountAssignmentDeletionStatusRequest::getXSecurityToken,
                DescribeAccountAssignmentDeletionStatusRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResponse> listAccountAssignmentCreationStatus =
        genForListAccountAssignmentCreationStatus();

    private static HttpRequestDef<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResponse> genForListAccountAssignmentCreationStatus() {
        // basic
        HttpRequestDef.Builder<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAccountAssignmentCreationStatusRequest.class,
                    ListAccountAssignmentCreationStatusResponse.class)
                .withName("ListAccountAssignmentCreationStatus")
                .withUri("/v1/instances/{instance_id}/account-assignments/creation-statuses")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentCreationStatusRequest::getInstanceId,
                ListAccountAssignmentCreationStatusRequest::setInstanceId));
        builder.<ListAccountAssignmentCreationStatusRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAccountAssignmentCreationStatusRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAccountAssignmentCreationStatusRequest::getStatus,
                ListAccountAssignmentCreationStatusRequest::setStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountAssignmentCreationStatusRequest::getLimit,
                ListAccountAssignmentCreationStatusRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentCreationStatusRequest::getMarker,
                ListAccountAssignmentCreationStatusRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentCreationStatusRequest::getXSecurityToken,
                ListAccountAssignmentCreationStatusRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResponse> listAccountAssignmentDeletionStatus =
        genForListAccountAssignmentDeletionStatus();

    private static HttpRequestDef<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResponse> genForListAccountAssignmentDeletionStatus() {
        // basic
        HttpRequestDef.Builder<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAccountAssignmentDeletionStatusRequest.class,
                    ListAccountAssignmentDeletionStatusResponse.class)
                .withName("ListAccountAssignmentDeletionStatus")
                .withUri("/v1/instances/{instance_id}/account-assignments/deletion-statuses")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentDeletionStatusRequest::getInstanceId,
                ListAccountAssignmentDeletionStatusRequest::setInstanceId));
        builder.<ListAccountAssignmentDeletionStatusRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAccountAssignmentDeletionStatusRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAccountAssignmentDeletionStatusRequest::getStatus,
                ListAccountAssignmentDeletionStatusRequest::setStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountAssignmentDeletionStatusRequest::getLimit,
                ListAccountAssignmentDeletionStatusRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentDeletionStatusRequest::getMarker,
                ListAccountAssignmentDeletionStatusRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentDeletionStatusRequest::getXSecurityToken,
                ListAccountAssignmentDeletionStatusRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountAssignmentsRequest, ListAccountAssignmentsResponse> listAccountAssignments =
        genForListAccountAssignments();

    private static HttpRequestDef<ListAccountAssignmentsRequest, ListAccountAssignmentsResponse> genForListAccountAssignments() {
        // basic
        HttpRequestDef.Builder<ListAccountAssignmentsRequest, ListAccountAssignmentsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAccountAssignmentsRequest.class, ListAccountAssignmentsResponse.class)
            .withName("ListAccountAssignments")
            .withUri("/v1/instances/{instance_id}/account-assignments")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsRequest::getInstanceId,
                ListAccountAssignmentsRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountAssignmentsRequest::getLimit, ListAccountAssignmentsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsRequest::getMarker, ListAccountAssignmentsRequest::setMarker));
        builder.<String>withRequestField("account_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsRequest::getAccountId,
                ListAccountAssignmentsRequest::setAccountId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsRequest::getPermissionSetId,
                ListAccountAssignmentsRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsRequest::getXSecurityToken,
                ListAccountAssignmentsRequest::setXSecurityToken));

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
                .withUri("/v1/instances")
                .withContentType("application/json");

        // requests
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
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getXSecurityToken, ListInstancesRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceAccessControlAttributeConfigurationRequest, CreateInstanceAccessControlAttributeConfigurationResponse> createInstanceAccessControlAttributeConfiguration =
        genForCreateInstanceAccessControlAttributeConfiguration();

    private static HttpRequestDef<CreateInstanceAccessControlAttributeConfigurationRequest, CreateInstanceAccessControlAttributeConfigurationResponse> genForCreateInstanceAccessControlAttributeConfiguration() {
        // basic
        HttpRequestDef.Builder<CreateInstanceAccessControlAttributeConfigurationRequest, CreateInstanceAccessControlAttributeConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateInstanceAccessControlAttributeConfigurationRequest.class,
                    CreateInstanceAccessControlAttributeConfigurationResponse.class)
                .withName("CreateInstanceAccessControlAttributeConfiguration")
                .withUri("/v1/instances/{instance_id}/access-control-attribute-configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceAccessControlAttributeConfigurationRequest::getInstanceId,
                CreateInstanceAccessControlAttributeConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceAccessControlAttributeConfigurationRequest::getXSecurityToken,
                CreateInstanceAccessControlAttributeConfigurationRequest::setXSecurityToken));
        builder.<CreateInstanceAccessControlAttributeConfigurationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceAccessControlAttributeConfigurationReqBody.class),
            f -> f.withMarshaller(CreateInstanceAccessControlAttributeConfigurationRequest::getBody,
                CreateInstanceAccessControlAttributeConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceAccessControlAttributeConfigurationRequest, DeleteInstanceAccessControlAttributeConfigurationResponse> deleteInstanceAccessControlAttributeConfiguration =
        genForDeleteInstanceAccessControlAttributeConfiguration();

    private static HttpRequestDef<DeleteInstanceAccessControlAttributeConfigurationRequest, DeleteInstanceAccessControlAttributeConfigurationResponse> genForDeleteInstanceAccessControlAttributeConfiguration() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceAccessControlAttributeConfigurationRequest, DeleteInstanceAccessControlAttributeConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteInstanceAccessControlAttributeConfigurationRequest.class,
                    DeleteInstanceAccessControlAttributeConfigurationResponse.class)
                .withName("DeleteInstanceAccessControlAttributeConfiguration")
                .withUri("/v1/instances/{instance_id}/access-control-attribute-configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceAccessControlAttributeConfigurationRequest::getInstanceId,
                DeleteInstanceAccessControlAttributeConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceAccessControlAttributeConfigurationRequest::getXSecurityToken,
                DeleteInstanceAccessControlAttributeConfigurationRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeInstanceAccessControlAttributeConfigurationRequest, DescribeInstanceAccessControlAttributeConfigurationResponse> describeInstanceAccessControlAttributeConfiguration =
        genForDescribeInstanceAccessControlAttributeConfiguration();

    private static HttpRequestDef<DescribeInstanceAccessControlAttributeConfigurationRequest, DescribeInstanceAccessControlAttributeConfigurationResponse> genForDescribeInstanceAccessControlAttributeConfiguration() {
        // basic
        HttpRequestDef.Builder<DescribeInstanceAccessControlAttributeConfigurationRequest, DescribeInstanceAccessControlAttributeConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DescribeInstanceAccessControlAttributeConfigurationRequest.class,
                    DescribeInstanceAccessControlAttributeConfigurationResponse.class)
                .withName("DescribeInstanceAccessControlAttributeConfiguration")
                .withUri("/v1/instances/{instance_id}/access-control-attribute-configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeInstanceAccessControlAttributeConfigurationRequest::getInstanceId,
                DescribeInstanceAccessControlAttributeConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeInstanceAccessControlAttributeConfigurationRequest::getXSecurityToken,
                DescribeInstanceAccessControlAttributeConfigurationRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceAccessControlAttributeConfigurationRequest, UpdateInstanceAccessControlAttributeConfigurationResponse> updateInstanceAccessControlAttributeConfiguration =
        genForUpdateInstanceAccessControlAttributeConfiguration();

    private static HttpRequestDef<UpdateInstanceAccessControlAttributeConfigurationRequest, UpdateInstanceAccessControlAttributeConfigurationResponse> genForUpdateInstanceAccessControlAttributeConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceAccessControlAttributeConfigurationRequest, UpdateInstanceAccessControlAttributeConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInstanceAccessControlAttributeConfigurationRequest.class,
                    UpdateInstanceAccessControlAttributeConfigurationResponse.class)
                .withName("UpdateInstanceAccessControlAttributeConfiguration")
                .withUri("/v1/instances/{instance_id}/access-control-attribute-configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceAccessControlAttributeConfigurationRequest::getInstanceId,
                UpdateInstanceAccessControlAttributeConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceAccessControlAttributeConfigurationRequest::getXSecurityToken,
                UpdateInstanceAccessControlAttributeConfigurationRequest::setXSecurityToken));
        builder.<UpdateInstanceAccessControlAttributeConfigurationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceAccessControlAttributeConfigurationReqBody.class),
            f -> f.withMarshaller(UpdateInstanceAccessControlAttributeConfigurationRequest::getBody,
                UpdateInstanceAccessControlAttributeConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResponse> attachManagedPolicyToPermissionSet =
        genForAttachManagedPolicyToPermissionSet();

    private static HttpRequestDef<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResponse> genForAttachManagedPolicyToPermissionSet() {
        // basic
        HttpRequestDef.Builder<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AttachManagedPolicyToPermissionSetRequest.class,
                    AttachManagedPolicyToPermissionSetResponse.class)
                .withName("AttachManagedPolicyToPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/attach-managed-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachManagedPolicyToPermissionSetRequest::getInstanceId,
                AttachManagedPolicyToPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachManagedPolicyToPermissionSetRequest::getPermissionSetId,
                AttachManagedPolicyToPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachManagedPolicyToPermissionSetRequest::getXSecurityToken,
                AttachManagedPolicyToPermissionSetRequest::setXSecurityToken));
        builder.<AttachManagedPolicyToPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachManagedPolicyToPermissionSetReqBody.class),
            f -> f.withMarshaller(AttachManagedPolicyToPermissionSetRequest::getBody,
                AttachManagedPolicyToPermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePermissionSetRequest, CreatePermissionSetResponse> createPermissionSet =
        genForCreatePermissionSet();

    private static HttpRequestDef<CreatePermissionSetRequest, CreatePermissionSetResponse> genForCreatePermissionSet() {
        // basic
        HttpRequestDef.Builder<CreatePermissionSetRequest, CreatePermissionSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePermissionSetRequest.class, CreatePermissionSetResponse.class)
                .withName("CreatePermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePermissionSetRequest::getInstanceId,
                CreatePermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePermissionSetRequest::getXSecurityToken,
                CreatePermissionSetRequest::setXSecurityToken));
        builder.<CreatePermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePermissionSetReqBody.class),
            f -> f.withMarshaller(CreatePermissionSetRequest::getBody, CreatePermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomPolicyFromPermissionSetRequest, DeleteCustomPolicyFromPermissionSetResponse> deleteCustomPolicyFromPermissionSet =
        genForDeleteCustomPolicyFromPermissionSet();

    private static HttpRequestDef<DeleteCustomPolicyFromPermissionSetRequest, DeleteCustomPolicyFromPermissionSetResponse> genForDeleteCustomPolicyFromPermissionSet() {
        // basic
        HttpRequestDef.Builder<DeleteCustomPolicyFromPermissionSetRequest, DeleteCustomPolicyFromPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCustomPolicyFromPermissionSetRequest.class,
                    DeleteCustomPolicyFromPermissionSetResponse.class)
                .withName("DeleteCustomPolicyFromPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/custom-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomPolicyFromPermissionSetRequest::getInstanceId,
                DeleteCustomPolicyFromPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomPolicyFromPermissionSetRequest::getPermissionSetId,
                DeleteCustomPolicyFromPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomPolicyFromPermissionSetRequest::getXSecurityToken,
                DeleteCustomPolicyFromPermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomRoleFromPermissionSetRequest, DeleteCustomRoleFromPermissionSetResponse> deleteCustomRoleFromPermissionSet =
        genForDeleteCustomRoleFromPermissionSet();

    private static HttpRequestDef<DeleteCustomRoleFromPermissionSetRequest, DeleteCustomRoleFromPermissionSetResponse> genForDeleteCustomRoleFromPermissionSet() {
        // basic
        HttpRequestDef.Builder<DeleteCustomRoleFromPermissionSetRequest, DeleteCustomRoleFromPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCustomRoleFromPermissionSetRequest.class,
                    DeleteCustomRoleFromPermissionSetResponse.class)
                .withName("DeleteCustomRoleFromPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/custom-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomRoleFromPermissionSetRequest::getInstanceId,
                DeleteCustomRoleFromPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomRoleFromPermissionSetRequest::getPermissionSetId,
                DeleteCustomRoleFromPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomRoleFromPermissionSetRequest::getXSecurityToken,
                DeleteCustomRoleFromPermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePermissionSetRequest, DeletePermissionSetResponse> deletePermissionSet =
        genForDeletePermissionSet();

    private static HttpRequestDef<DeletePermissionSetRequest, DeletePermissionSetResponse> genForDeletePermissionSet() {
        // basic
        HttpRequestDef.Builder<DeletePermissionSetRequest, DeletePermissionSetResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePermissionSetRequest.class, DeletePermissionSetResponse.class)
            .withName("DeletePermissionSet")
            .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePermissionSetRequest::getInstanceId,
                DeletePermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePermissionSetRequest::getPermissionSetId,
                DeletePermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePermissionSetRequest::getXSecurityToken,
                DeletePermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribePermissionSetRequest, DescribePermissionSetResponse> describePermissionSet =
        genForDescribePermissionSet();

    private static HttpRequestDef<DescribePermissionSetRequest, DescribePermissionSetResponse> genForDescribePermissionSet() {
        // basic
        HttpRequestDef.Builder<DescribePermissionSetRequest, DescribePermissionSetResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DescribePermissionSetRequest.class, DescribePermissionSetResponse.class)
            .withName("DescribePermissionSet")
            .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePermissionSetRequest::getInstanceId,
                DescribePermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePermissionSetRequest::getPermissionSetId,
                DescribePermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePermissionSetRequest::getXSecurityToken,
                DescribePermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResponse> describePermissionSetProvisioningStatus =
        genForDescribePermissionSetProvisioningStatus();

    private static HttpRequestDef<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResponse> genForDescribePermissionSetProvisioningStatus() {
        // basic
        HttpRequestDef.Builder<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DescribePermissionSetProvisioningStatusRequest.class,
                    DescribePermissionSetProvisioningStatusResponse.class)
                .withName("DescribePermissionSetProvisioningStatus")
                .withUri("/v1/instances/{instance_id}/permission-sets/provisioning-status/{request_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePermissionSetProvisioningStatusRequest::getInstanceId,
                DescribePermissionSetProvisioningStatusRequest::setInstanceId));
        builder.<String>withRequestField("request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePermissionSetProvisioningStatusRequest::getRequestId,
                DescribePermissionSetProvisioningStatusRequest::setRequestId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePermissionSetProvisioningStatusRequest::getXSecurityToken,
                DescribePermissionSetProvisioningStatusRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResponse> detachManagedPolicyFromPermissionSet =
        genForDetachManagedPolicyFromPermissionSet();

    private static HttpRequestDef<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResponse> genForDetachManagedPolicyFromPermissionSet() {
        // basic
        HttpRequestDef.Builder<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DetachManagedPolicyFromPermissionSetRequest.class,
                    DetachManagedPolicyFromPermissionSetResponse.class)
                .withName("DetachManagedPolicyFromPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/detach-managed-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachManagedPolicyFromPermissionSetRequest::getInstanceId,
                DetachManagedPolicyFromPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachManagedPolicyFromPermissionSetRequest::getPermissionSetId,
                DetachManagedPolicyFromPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachManagedPolicyFromPermissionSetRequest::getXSecurityToken,
                DetachManagedPolicyFromPermissionSetRequest::setXSecurityToken));
        builder.<DetachManagedPolicyFromPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetachManagedPolicyFromPermissionSetReqBody.class),
            f -> f.withMarshaller(DetachManagedPolicyFromPermissionSetRequest::getBody,
                DetachManagedPolicyFromPermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetCustomPolicyForPermissionSetRequest, GetCustomPolicyForPermissionSetResponse> getCustomPolicyForPermissionSet =
        genForGetCustomPolicyForPermissionSet();

    private static HttpRequestDef<GetCustomPolicyForPermissionSetRequest, GetCustomPolicyForPermissionSetResponse> genForGetCustomPolicyForPermissionSet() {
        // basic
        HttpRequestDef.Builder<GetCustomPolicyForPermissionSetRequest, GetCustomPolicyForPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GetCustomPolicyForPermissionSetRequest.class,
                    GetCustomPolicyForPermissionSetResponse.class)
                .withName("GetCustomPolicyForPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/custom-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetCustomPolicyForPermissionSetRequest::getInstanceId,
                GetCustomPolicyForPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetCustomPolicyForPermissionSetRequest::getPermissionSetId,
                GetCustomPolicyForPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetCustomPolicyForPermissionSetRequest::getXSecurityToken,
                GetCustomPolicyForPermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetCustomRoleForPermissionSetRequest, GetCustomRoleForPermissionSetResponse> getCustomRoleForPermissionSet =
        genForGetCustomRoleForPermissionSet();

    private static HttpRequestDef<GetCustomRoleForPermissionSetRequest, GetCustomRoleForPermissionSetResponse> genForGetCustomRoleForPermissionSet() {
        // basic
        HttpRequestDef.Builder<GetCustomRoleForPermissionSetRequest, GetCustomRoleForPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GetCustomRoleForPermissionSetRequest.class,
                    GetCustomRoleForPermissionSetResponse.class)
                .withName("GetCustomRoleForPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/custom-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetCustomRoleForPermissionSetRequest::getInstanceId,
                GetCustomRoleForPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetCustomRoleForPermissionSetRequest::getPermissionSetId,
                GetCustomRoleForPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetCustomRoleForPermissionSetRequest::getXSecurityToken,
                GetCustomRoleForPermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResponse> listAccountsForProvisionedPermissionSet =
        genForListAccountsForProvisionedPermissionSet();

    private static HttpRequestDef<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResponse> genForListAccountsForProvisionedPermissionSet() {
        // basic
        HttpRequestDef.Builder<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAccountsForProvisionedPermissionSetRequest.class,
                    ListAccountsForProvisionedPermissionSetResponse.class)
                .withName("ListAccountsForProvisionedPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsForProvisionedPermissionSetRequest::getInstanceId,
                ListAccountsForProvisionedPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsForProvisionedPermissionSetRequest::getPermissionSetId,
                ListAccountsForProvisionedPermissionSetRequest::setPermissionSetId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountsForProvisionedPermissionSetRequest::getLimit,
                ListAccountsForProvisionedPermissionSetRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsForProvisionedPermissionSetRequest::getMarker,
                ListAccountsForProvisionedPermissionSetRequest::setMarker));
        builder.<ListAccountsForProvisionedPermissionSetRequest.ProvisioningStatusEnum>withRequestField(
            "provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAccountsForProvisionedPermissionSetRequest.ProvisioningStatusEnum.class),
            f -> f.withMarshaller(ListAccountsForProvisionedPermissionSetRequest::getProvisioningStatus,
                ListAccountsForProvisionedPermissionSetRequest::setProvisioningStatus));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsForProvisionedPermissionSetRequest::getXSecurityToken,
                ListAccountsForProvisionedPermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResponse> listManagedPoliciesInPermissionSet =
        genForListManagedPoliciesInPermissionSet();

    private static HttpRequestDef<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResponse> genForListManagedPoliciesInPermissionSet() {
        // basic
        HttpRequestDef.Builder<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListManagedPoliciesInPermissionSetRequest.class,
                    ListManagedPoliciesInPermissionSetResponse.class)
                .withName("ListManagedPoliciesInPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/managed-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedPoliciesInPermissionSetRequest::getInstanceId,
                ListManagedPoliciesInPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedPoliciesInPermissionSetRequest::getPermissionSetId,
                ListManagedPoliciesInPermissionSetRequest::setPermissionSetId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManagedPoliciesInPermissionSetRequest::getLimit,
                ListManagedPoliciesInPermissionSetRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedPoliciesInPermissionSetRequest::getMarker,
                ListManagedPoliciesInPermissionSetRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedPoliciesInPermissionSetRequest::getXSecurityToken,
                ListManagedPoliciesInPermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResponse> listPermissionSetProvisioningStatus =
        genForListPermissionSetProvisioningStatus();

    private static HttpRequestDef<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResponse> genForListPermissionSetProvisioningStatus() {
        // basic
        HttpRequestDef.Builder<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPermissionSetProvisioningStatusRequest.class,
                    ListPermissionSetProvisioningStatusResponse.class)
                .withName("ListPermissionSetProvisioningStatus")
                .withUri("/v1/instances/{instance_id}/permission-sets/provisioning-statuses")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetProvisioningStatusRequest::getInstanceId,
                ListPermissionSetProvisioningStatusRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPermissionSetProvisioningStatusRequest::getLimit,
                ListPermissionSetProvisioningStatusRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetProvisioningStatusRequest::getMarker,
                ListPermissionSetProvisioningStatusRequest::setMarker));
        builder.<ListPermissionSetProvisioningStatusRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPermissionSetProvisioningStatusRequest.StatusEnum.class),
            f -> f.withMarshaller(ListPermissionSetProvisioningStatusRequest::getStatus,
                ListPermissionSetProvisioningStatusRequest::setStatus));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetProvisioningStatusRequest::getXSecurityToken,
                ListPermissionSetProvisioningStatusRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermissionSetsRequest, ListPermissionSetsResponse> listPermissionSets =
        genForListPermissionSets();

    private static HttpRequestDef<ListPermissionSetsRequest, ListPermissionSetsResponse> genForListPermissionSets() {
        // basic
        HttpRequestDef.Builder<ListPermissionSetsRequest, ListPermissionSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPermissionSetsRequest.class, ListPermissionSetsResponse.class)
                .withName("ListPermissionSets")
                .withUri("/v1/instances/{instance_id}/permission-sets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getInstanceId, ListPermissionSetsRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getLimit, ListPermissionSetsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getMarker, ListPermissionSetsRequest::setMarker));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getPermissionSetId,
                ListPermissionSetsRequest::setPermissionSetId));
        builder.<String>withRequestField("permission_urn",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getPermissionUrn,
                ListPermissionSetsRequest::setPermissionUrn));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getName, ListPermissionSetsRequest::setName));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getXSecurityToken,
                ListPermissionSetsRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResponse> listPermissionSetsProvisionedToAccount =
        genForListPermissionSetsProvisionedToAccount();

    private static HttpRequestDef<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResponse> genForListPermissionSetsProvisionedToAccount() {
        // basic
        HttpRequestDef.Builder<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPermissionSetsProvisionedToAccountRequest.class,
                    ListPermissionSetsProvisionedToAccountResponse.class)
                .withName("ListPermissionSetsProvisionedToAccount")
                .withUri("/v1/instances/{instance_id}/permission-sets/provisioned-to-accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsProvisionedToAccountRequest::getInstanceId,
                ListPermissionSetsProvisionedToAccountRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPermissionSetsProvisionedToAccountRequest::getLimit,
                ListPermissionSetsProvisionedToAccountRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsProvisionedToAccountRequest::getMarker,
                ListPermissionSetsProvisionedToAccountRequest::setMarker));
        builder.<String>withRequestField("account_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsProvisionedToAccountRequest::getAccountId,
                ListPermissionSetsProvisionedToAccountRequest::setAccountId));
        builder.<ListPermissionSetsProvisionedToAccountRequest.ProvisioningStatusEnum>withRequestField(
            "provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPermissionSetsProvisionedToAccountRequest.ProvisioningStatusEnum.class),
            f -> f.withMarshaller(ListPermissionSetsProvisionedToAccountRequest::getProvisioningStatus,
                ListPermissionSetsProvisionedToAccountRequest::setProvisioningStatus));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsProvisionedToAccountRequest::getXSecurityToken,
                ListPermissionSetsProvisionedToAccountRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ProvisionPermissionSetRequest, ProvisionPermissionSetResponse> provisionPermissionSet =
        genForProvisionPermissionSet();

    private static HttpRequestDef<ProvisionPermissionSetRequest, ProvisionPermissionSetResponse> genForProvisionPermissionSet() {
        // basic
        HttpRequestDef.Builder<ProvisionPermissionSetRequest, ProvisionPermissionSetResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ProvisionPermissionSetRequest.class, ProvisionPermissionSetResponse.class)
            .withName("ProvisionPermissionSet")
            .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/provision")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ProvisionPermissionSetRequest::getInstanceId,
                ProvisionPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ProvisionPermissionSetRequest::getPermissionSetId,
                ProvisionPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ProvisionPermissionSetRequest::getXSecurityToken,
                ProvisionPermissionSetRequest::setXSecurityToken));
        builder.<ProvisionPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProvisionPermissionSetReqBody.class),
            f -> f.withMarshaller(ProvisionPermissionSetRequest::getBody, ProvisionPermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PutCustomPolicyToPermissionSetRequest, PutCustomPolicyToPermissionSetResponse> putCustomPolicyToPermissionSet =
        genForPutCustomPolicyToPermissionSet();

    private static HttpRequestDef<PutCustomPolicyToPermissionSetRequest, PutCustomPolicyToPermissionSetResponse> genForPutCustomPolicyToPermissionSet() {
        // basic
        HttpRequestDef.Builder<PutCustomPolicyToPermissionSetRequest, PutCustomPolicyToPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    PutCustomPolicyToPermissionSetRequest.class,
                    PutCustomPolicyToPermissionSetResponse.class)
                .withName("PutCustomPolicyToPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/custom-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutCustomPolicyToPermissionSetRequest::getInstanceId,
                PutCustomPolicyToPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutCustomPolicyToPermissionSetRequest::getPermissionSetId,
                PutCustomPolicyToPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutCustomPolicyToPermissionSetRequest::getXSecurityToken,
                PutCustomPolicyToPermissionSetRequest::setXSecurityToken));
        builder.<PutCustomPolicyToPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutCustomPolicyToPermissionSetReqBody.class),
            f -> f.withMarshaller(PutCustomPolicyToPermissionSetRequest::getBody,
                PutCustomPolicyToPermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PutCustomRoleToPermissionSetRequest, PutCustomRoleToPermissionSetResponse> putCustomRoleToPermissionSet =
        genForPutCustomRoleToPermissionSet();

    private static HttpRequestDef<PutCustomRoleToPermissionSetRequest, PutCustomRoleToPermissionSetResponse> genForPutCustomRoleToPermissionSet() {
        // basic
        HttpRequestDef.Builder<PutCustomRoleToPermissionSetRequest, PutCustomRoleToPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    PutCustomRoleToPermissionSetRequest.class,
                    PutCustomRoleToPermissionSetResponse.class)
                .withName("PutCustomRoleToPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/custom-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutCustomRoleToPermissionSetRequest::getInstanceId,
                PutCustomRoleToPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutCustomRoleToPermissionSetRequest::getPermissionSetId,
                PutCustomRoleToPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutCustomRoleToPermissionSetRequest::getXSecurityToken,
                PutCustomRoleToPermissionSetRequest::setXSecurityToken));
        builder.<PutCustomRoleToPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutCustomRoleToPermissionSetReqBody.class),
            f -> f.withMarshaller(PutCustomRoleToPermissionSetRequest::getBody,
                PutCustomRoleToPermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePermissionSetRequest, UpdatePermissionSetResponse> updatePermissionSet =
        genForUpdatePermissionSet();

    private static HttpRequestDef<UpdatePermissionSetRequest, UpdatePermissionSetResponse> genForUpdatePermissionSet() {
        // basic
        HttpRequestDef.Builder<UpdatePermissionSetRequest, UpdatePermissionSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePermissionSetRequest.class, UpdatePermissionSetResponse.class)
                .withName("UpdatePermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePermissionSetRequest::getInstanceId,
                UpdatePermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePermissionSetRequest::getPermissionSetId,
                UpdatePermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePermissionSetRequest::getXSecurityToken,
                UpdatePermissionSetRequest::setXSecurityToken));
        builder.<UpdatePermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePermissionSetReqBody.class),
            f -> f.withMarshaller(UpdatePermissionSetRequest::getBody, UpdatePermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagResourceRequest, CreateTagResourceResponse> createTagResource =
        genForCreateTagResource();

    private static HttpRequestDef<CreateTagResourceRequest, CreateTagResourceResponse> genForCreateTagResource() {
        // basic
        HttpRequestDef.Builder<CreateTagResourceRequest, CreateTagResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagResourceRequest.class, CreateTagResourceResponse.class)
                .withName("CreateTagResource")
                .withUri("/v1/instances/{resource_type}/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<CreateTagResourceRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagResourceRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(CreateTagResourceRequest::getResourceType,
                CreateTagResourceRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagResourceRequest::getResourceId, CreateTagResourceRequest::setResourceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagResourceRequest::getXSecurityToken,
                CreateTagResourceRequest::setXSecurityToken));
        builder.<TagResourceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceReqBody.class),
            f -> f.withMarshaller(CreateTagResourceRequest::getBody, CreateTagResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagResourceRequest, DeleteTagResourceResponse> deleteTagResource =
        genForDeleteTagResource();

    private static HttpRequestDef<DeleteTagResourceRequest, DeleteTagResourceResponse> genForDeleteTagResource() {
        // basic
        HttpRequestDef.Builder<DeleteTagResourceRequest, DeleteTagResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteTagResourceRequest.class, DeleteTagResourceResponse.class)
                .withName("DeleteTagResource")
                .withUri("/v1/instances/{resource_type}/{resource_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteTagResourceRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTagResourceRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(DeleteTagResourceRequest::getResourceType,
                DeleteTagResourceRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagResourceRequest::getResourceId, DeleteTagResourceRequest::setResourceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagResourceRequest::getXSecurityToken,
                DeleteTagResourceRequest::setXSecurityToken));
        builder.<DeleteTagResourceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTagResourceReqBody.class),
            f -> f.withMarshaller(DeleteTagResourceRequest::getBody, DeleteTagResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagResourcesRequest, ListTagResourcesResponse> listTagResources =
        genForListTagResources();

    private static HttpRequestDef<ListTagResourcesRequest, ListTagResourcesResponse> genForListTagResources() {
        // basic
        HttpRequestDef.Builder<ListTagResourcesRequest, ListTagResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagResourcesRequest.class, ListTagResourcesResponse.class)
                .withName("ListTagResources")
                .withUri("/v1/instances/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListTagResourcesRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTagResourcesRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListTagResourcesRequest::getResourceType, ListTagResourcesRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagResourcesRequest::getResourceId, ListTagResourcesRequest::setResourceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagResourcesRequest::getLimit, ListTagResourcesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagResourcesRequest::getMarker, ListTagResourcesRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagResourcesRequest::getXSecurityToken,
                ListTagResourcesRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachManagedRoleToPermissionSetRequest, AttachManagedRoleToPermissionSetResponse> attachManagedRoleToPermissionSet =
        genForAttachManagedRoleToPermissionSet();

    private static HttpRequestDef<AttachManagedRoleToPermissionSetRequest, AttachManagedRoleToPermissionSetResponse> genForAttachManagedRoleToPermissionSet() {
        // basic
        HttpRequestDef.Builder<AttachManagedRoleToPermissionSetRequest, AttachManagedRoleToPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AttachManagedRoleToPermissionSetRequest.class,
                    AttachManagedRoleToPermissionSetResponse.class)
                .withName("AttachManagedRoleToPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/attach-managed-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachManagedRoleToPermissionSetRequest::getInstanceId,
                AttachManagedRoleToPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachManagedRoleToPermissionSetRequest::getPermissionSetId,
                AttachManagedRoleToPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachManagedRoleToPermissionSetRequest::getXSecurityToken,
                AttachManagedRoleToPermissionSetRequest::setXSecurityToken));
        builder.<ResourceAttachManagedPolicyToPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceAttachManagedPolicyToPermissionSetReqBody.class),
            f -> f.withMarshaller(AttachManagedRoleToPermissionSetRequest::getBody,
                AttachManagedRoleToPermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachManagedRoleFromPermissionSetRequest, DetachManagedRoleFromPermissionSetResponse> detachManagedRoleFromPermissionSet =
        genForDetachManagedRoleFromPermissionSet();

    private static HttpRequestDef<DetachManagedRoleFromPermissionSetRequest, DetachManagedRoleFromPermissionSetResponse> genForDetachManagedRoleFromPermissionSet() {
        // basic
        HttpRequestDef.Builder<DetachManagedRoleFromPermissionSetRequest, DetachManagedRoleFromPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DetachManagedRoleFromPermissionSetRequest.class,
                    DetachManagedRoleFromPermissionSetResponse.class)
                .withName("DetachManagedRoleFromPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/detach-managed-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachManagedRoleFromPermissionSetRequest::getInstanceId,
                DetachManagedRoleFromPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachManagedRoleFromPermissionSetRequest::getPermissionSetId,
                DetachManagedRoleFromPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachManagedRoleFromPermissionSetRequest::getXSecurityToken,
                DetachManagedRoleFromPermissionSetRequest::setXSecurityToken));
        builder.<ResourceDetachManagedPolicyFromPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceDetachManagedPolicyFromPermissionSetReqBody.class),
            f -> f.withMarshaller(DetachManagedRoleFromPermissionSetRequest::getBody,
                DetachManagedRoleFromPermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListManagedRolesInPermissionSetRequest, ListManagedRolesInPermissionSetResponse> listManagedRolesInPermissionSet =
        genForListManagedRolesInPermissionSet();

    private static HttpRequestDef<ListManagedRolesInPermissionSetRequest, ListManagedRolesInPermissionSetResponse> genForListManagedRolesInPermissionSet() {
        // basic
        HttpRequestDef.Builder<ListManagedRolesInPermissionSetRequest, ListManagedRolesInPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListManagedRolesInPermissionSetRequest.class,
                    ListManagedRolesInPermissionSetResponse.class)
                .withName("ListManagedRolesInPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/managed-roles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedRolesInPermissionSetRequest::getInstanceId,
                ListManagedRolesInPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedRolesInPermissionSetRequest::getPermissionSetId,
                ListManagedRolesInPermissionSetRequest::setPermissionSetId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManagedRolesInPermissionSetRequest::getLimit,
                ListManagedRolesInPermissionSetRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedRolesInPermissionSetRequest::getMarker,
                ListManagedRolesInPermissionSetRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedRolesInPermissionSetRequest::getXSecurityToken,
                ListManagedRolesInPermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

}
