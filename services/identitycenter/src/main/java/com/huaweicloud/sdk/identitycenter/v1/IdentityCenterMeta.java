package com.huaweicloud.sdk.identitycenter.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachCustomerManagedPolicyToPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachCustomerManagedPolicyToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachCustomerManagedPolicyToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedPolicyToPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedPolicyToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedPolicyToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAccountAssignmentReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAccountAssignmentRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAccountAssignmentResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeletePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeletePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentCreationStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentCreationStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentDeletionStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentDeletionStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetProvisioningStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetProvisioningStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachCustomerManagedPolicyReferenceFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachCustomerManagedPolicyReferenceFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentCreationStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentCreationStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentDeletionStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentDeletionStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountsForProvisionedPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountsForProvisionedPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListCustomerManagedPolicyReferencesInPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListCustomerManagedPolicyReferencesInPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListInstancesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedPoliciesInPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedPoliciesInPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetProvisioningStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetProvisioningStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsProvisionedToAccountRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsProvisionedToAccountResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListProfileAssociationsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListProfileAssociationsResponse;
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

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProfileAssociationsRequest, ListProfileAssociationsResponse> listProfileAssociations =
        genForListProfileAssociations();

    private static HttpRequestDef<ListProfileAssociationsRequest, ListProfileAssociationsResponse> genForListProfileAssociations() {
        // basic
        HttpRequestDef.Builder<ListProfileAssociationsRequest, ListProfileAssociationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProfileAssociationsRequest.class, ListProfileAssociationsResponse.class)
            .withName("ListProfileAssociations")
            .withUri("/v1/instances/{instance_id}/profile-associations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProfileAssociationsRequest::getInstanceId,
                ListProfileAssociationsRequest::setInstanceId));
        builder.<String>withRequestField("profile_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProfileAssociationsRequest::getProfileId,
                ListProfileAssociationsRequest::setProfileId));

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

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachCustomerManagedPolicyToPermissionSetRequest, AttachCustomerManagedPolicyToPermissionSetResponse> attachCustomerManagedPolicyToPermissionSet =
        genForAttachCustomerManagedPolicyToPermissionSet();

    private static HttpRequestDef<AttachCustomerManagedPolicyToPermissionSetRequest, AttachCustomerManagedPolicyToPermissionSetResponse> genForAttachCustomerManagedPolicyToPermissionSet() {
        // basic
        HttpRequestDef.Builder<AttachCustomerManagedPolicyToPermissionSetRequest, AttachCustomerManagedPolicyToPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AttachCustomerManagedPolicyToPermissionSetRequest.class,
                    AttachCustomerManagedPolicyToPermissionSetResponse.class)
                .withName("AttachCustomerManagedPolicyToPermissionSet")
                .withUri(
                    "/v1/instances/{instance_id}/permission-sets/{permission_set_id}/attach-customer-managed-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachCustomerManagedPolicyToPermissionSetRequest::getPermissionSetId,
                AttachCustomerManagedPolicyToPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachCustomerManagedPolicyToPermissionSetRequest::getInstanceId,
                AttachCustomerManagedPolicyToPermissionSetRequest::setInstanceId));
        builder.<AttachCustomerManagedPolicyToPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachCustomerManagedPolicyToPermissionSetReqBody.class),
            f -> f.withMarshaller(AttachCustomerManagedPolicyToPermissionSetRequest::getBody,
                AttachCustomerManagedPolicyToPermissionSetRequest::setBody));

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
        builder.<CreatePermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePermissionSetReqBody.class),
            f -> f.withMarshaller(CreatePermissionSetRequest::getBody, CreatePermissionSetRequest::setBody));

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

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachCustomerManagedPolicyReferenceFromPermissionSetRequest, DetachCustomerManagedPolicyReferenceFromPermissionSetResponse> detachCustomerManagedPolicyReferenceFromPermissionSet =
        genForDetachCustomerManagedPolicyReferenceFromPermissionSet();

    private static HttpRequestDef<DetachCustomerManagedPolicyReferenceFromPermissionSetRequest, DetachCustomerManagedPolicyReferenceFromPermissionSetResponse> genForDetachCustomerManagedPolicyReferenceFromPermissionSet() {
        // basic
        HttpRequestDef.Builder<DetachCustomerManagedPolicyReferenceFromPermissionSetRequest, DetachCustomerManagedPolicyReferenceFromPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DetachCustomerManagedPolicyReferenceFromPermissionSetRequest.class,
                    DetachCustomerManagedPolicyReferenceFromPermissionSetResponse.class)
                .withName("DetachCustomerManagedPolicyReferenceFromPermissionSet")
                .withUri(
                    "/v1/instances/{instance_id}/permission-sets/{permission_set_id}/detach-customer-managed-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachCustomerManagedPolicyReferenceFromPermissionSetRequest::getInstanceId,
                DetachCustomerManagedPolicyReferenceFromPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachCustomerManagedPolicyReferenceFromPermissionSetRequest::getPermissionSetId,
                DetachCustomerManagedPolicyReferenceFromPermissionSetRequest::setPermissionSetId));
        builder.<DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetachCustomerManagedPolicyReferenceFromPermissionSetReqBody.class),
            f -> f.withMarshaller(DetachCustomerManagedPolicyReferenceFromPermissionSetRequest::getBody,
                DetachCustomerManagedPolicyReferenceFromPermissionSetRequest::setBody));

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
        builder.<DetachManagedPolicyFromPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetachManagedPolicyFromPermissionSetReqBody.class),
            f -> f.withMarshaller(DetachManagedPolicyFromPermissionSetRequest::getBody,
                DetachManagedPolicyFromPermissionSetRequest::setBody));

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

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerManagedPolicyReferencesInPermissionSetRequest, ListCustomerManagedPolicyReferencesInPermissionSetResponse> listCustomerManagedPolicyReferencesInPermissionSet =
        genForListCustomerManagedPolicyReferencesInPermissionSet();

    private static HttpRequestDef<ListCustomerManagedPolicyReferencesInPermissionSetRequest, ListCustomerManagedPolicyReferencesInPermissionSetResponse> genForListCustomerManagedPolicyReferencesInPermissionSet() {
        // basic
        HttpRequestDef.Builder<ListCustomerManagedPolicyReferencesInPermissionSetRequest, ListCustomerManagedPolicyReferencesInPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCustomerManagedPolicyReferencesInPermissionSetRequest.class,
                    ListCustomerManagedPolicyReferencesInPermissionSetResponse.class)
                .withName("ListCustomerManagedPolicyReferencesInPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/customer-managed-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerManagedPolicyReferencesInPermissionSetRequest::getInstanceId,
                ListCustomerManagedPolicyReferencesInPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerManagedPolicyReferencesInPermissionSetRequest::getPermissionSetId,
                ListCustomerManagedPolicyReferencesInPermissionSetRequest::setPermissionSetId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerManagedPolicyReferencesInPermissionSetRequest::getLimit,
                ListCustomerManagedPolicyReferencesInPermissionSetRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerManagedPolicyReferencesInPermissionSetRequest::getMarker,
                ListCustomerManagedPolicyReferencesInPermissionSetRequest::setMarker));

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
        builder.<UpdatePermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePermissionSetReqBody.class),
            f -> f.withMarshaller(UpdatePermissionSetRequest::getBody, UpdatePermissionSetRequest::setBody));

        // response

        return builder.build();
    }

}
