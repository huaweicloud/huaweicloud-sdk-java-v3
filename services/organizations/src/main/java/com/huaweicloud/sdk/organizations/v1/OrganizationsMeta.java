package com.huaweicloud.sdk.organizations.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.organizations.v1.model.AcceptHandshakeRequest;
import com.huaweicloud.sdk.organizations.v1.model.AcceptHandshakeResponse;
import com.huaweicloud.sdk.organizations.v1.model.AttachPolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.AttachPolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.CancelHandshakeRequest;
import com.huaweicloud.sdk.organizations.v1.model.CancelHandshakeResponse;
import com.huaweicloud.sdk.organizations.v1.model.CloseAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.CloseAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.CreateAccountReqBody;
import com.huaweicloud.sdk.organizations.v1.model.CreateAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.CreateAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.CreateOrganizationRequest;
import com.huaweicloud.sdk.organizations.v1.model.CreateOrganizationResponse;
import com.huaweicloud.sdk.organizations.v1.model.CreateOrganizationalUnitReqBody;
import com.huaweicloud.sdk.organizations.v1.model.CreateOrganizationalUnitRequest;
import com.huaweicloud.sdk.organizations.v1.model.CreateOrganizationalUnitResponse;
import com.huaweicloud.sdk.organizations.v1.model.CreatePolicyReqBody;
import com.huaweicloud.sdk.organizations.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.CreateTagResourceRequest;
import com.huaweicloud.sdk.organizations.v1.model.CreateTagResourceResponse;
import com.huaweicloud.sdk.organizations.v1.model.DeclineHandshakeRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeclineHandshakeResponse;
import com.huaweicloud.sdk.organizations.v1.model.DelegatedAdministratorReqBody;
import com.huaweicloud.sdk.organizations.v1.model.DeleteOrganizationRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeleteOrganizationResponse;
import com.huaweicloud.sdk.organizations.v1.model.DeleteOrganizationalUnitRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeleteOrganizationalUnitResponse;
import com.huaweicloud.sdk.organizations.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeletePolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.DeleteTagResourceRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeleteTagResourceResponse;
import com.huaweicloud.sdk.organizations.v1.model.DeregisterDelegatedAdministratorRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeregisterDelegatedAdministratorResponse;
import com.huaweicloud.sdk.organizations.v1.model.DetachPolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.DetachPolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.DisablePolicyTypeRequest;
import com.huaweicloud.sdk.organizations.v1.model.DisablePolicyTypeResponse;
import com.huaweicloud.sdk.organizations.v1.model.DisableTrustedServiceRequest;
import com.huaweicloud.sdk.organizations.v1.model.DisableTrustedServiceResponse;
import com.huaweicloud.sdk.organizations.v1.model.EnablePolicyTypeRequest;
import com.huaweicloud.sdk.organizations.v1.model.EnablePolicyTypeResponse;
import com.huaweicloud.sdk.organizations.v1.model.EnableTrustedServiceRequest;
import com.huaweicloud.sdk.organizations.v1.model.EnableTrustedServiceResponse;
import com.huaweicloud.sdk.organizations.v1.model.InviteAccountReqBody;
import com.huaweicloud.sdk.organizations.v1.model.InviteAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.InviteAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.LeaveOrganizationRequest;
import com.huaweicloud.sdk.organizations.v1.model.LeaveOrganizationResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListAccountsRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListAccountsResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListCloseAccountStatusesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListCloseAccountStatusesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListCreateAccountStatusesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListCreateAccountStatusesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListDelegatedAdministratorsRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListDelegatedAdministratorsResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListDelegatedServicesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListDelegatedServicesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListEntitiesForPolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListEntitiesForPolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListEntitiesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListEntitiesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListHandshakesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListHandshakesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListOrganizationalUnitsRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListOrganizationalUnitsResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListPoliciesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListPoliciesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListQuotasRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListQuotasResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListReceivedHandshakesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListReceivedHandshakesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListResourceInstancesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListResourceInstancesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListResourceTagsRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListResourceTagsResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListRootsRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListRootsResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListServicesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListServicesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListTagPolicyServicesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListTagPolicyServicesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListTagResourcesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListTagResourcesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListTagsForResourceRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListTagsForResourceResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListTrustedServicesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListTrustedServicesResponse;
import com.huaweicloud.sdk.organizations.v1.model.MoveAccountReqBody;
import com.huaweicloud.sdk.organizations.v1.model.MoveAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.MoveAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.PolicyTachReqBody;
import com.huaweicloud.sdk.organizations.v1.model.PolicyTypeReqBody;
import com.huaweicloud.sdk.organizations.v1.model.RegisterDelegatedAdministratorRequest;
import com.huaweicloud.sdk.organizations.v1.model.RegisterDelegatedAdministratorResponse;
import com.huaweicloud.sdk.organizations.v1.model.RemoveAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.RemoveAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.ResourceInstanceReqBody;
import com.huaweicloud.sdk.organizations.v1.model.ShowAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowCreateAccountStatusRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowCreateAccountStatusResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowEffectivePoliciesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowEffectivePoliciesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowHandshakeRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowHandshakeResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowOrganizationRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowOrganizationResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowOrganizationalUnitRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowOrganizationalUnitResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowPolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowPolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowResourceInstancesCountRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowResourceInstancesCountResponse;
import com.huaweicloud.sdk.organizations.v1.model.TagResourceReqBody;
import com.huaweicloud.sdk.organizations.v1.model.TagResourceRequest;
import com.huaweicloud.sdk.organizations.v1.model.TagResourceResponse;
import com.huaweicloud.sdk.organizations.v1.model.TrustedServiceReqBody;
import com.huaweicloud.sdk.organizations.v1.model.UntagResourceReqBody;
import com.huaweicloud.sdk.organizations.v1.model.UntagResourceRequest;
import com.huaweicloud.sdk.organizations.v1.model.UntagResourceResponse;
import com.huaweicloud.sdk.organizations.v1.model.UpdateOrganizationalUnitReqBody;
import com.huaweicloud.sdk.organizations.v1.model.UpdateOrganizationalUnitRequest;
import com.huaweicloud.sdk.organizations.v1.model.UpdateOrganizationalUnitResponse;
import com.huaweicloud.sdk.organizations.v1.model.UpdatePolicyReqBody;
import com.huaweicloud.sdk.organizations.v1.model.UpdatePolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.UpdatePolicyResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class OrganizationsMeta {

    public static final HttpRequestDef<CloseAccountRequest, CloseAccountResponse> closeAccount = genForCloseAccount();

    private static HttpRequestDef<CloseAccountRequest, CloseAccountResponse> genForCloseAccount() {
        // basic
        HttpRequestDef.Builder<CloseAccountRequest, CloseAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CloseAccountRequest.class, CloseAccountResponse.class)
                .withName("CloseAccount")
                .withUri("/v1/organizations/accounts/{account_id}/close")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CloseAccountRequest::getAccountId, CloseAccountRequest::setAccountId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAccountRequest, CreateAccountResponse> createAccount =
        genForCreateAccount();

    private static HttpRequestDef<CreateAccountRequest, CreateAccountResponse> genForCreateAccount() {
        // basic
        HttpRequestDef.Builder<CreateAccountRequest, CreateAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccountRequest.class, CreateAccountResponse.class)
                .withName("CreateAccount")
                .withUri("/v1/organizations/accounts")
                .withContentType("application/json");

        // requests
        builder.<CreateAccountReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAccountReqBody.class),
            f -> f.withMarshaller(CreateAccountRequest::getBody, CreateAccountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InviteAccountRequest, InviteAccountResponse> inviteAccount =
        genForInviteAccount();

    private static HttpRequestDef<InviteAccountRequest, InviteAccountResponse> genForInviteAccount() {
        // basic
        HttpRequestDef.Builder<InviteAccountRequest, InviteAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InviteAccountRequest.class, InviteAccountResponse.class)
                .withName("InviteAccount")
                .withUri("/v1/organizations/accounts/invite")
                .withContentType("application/json");

        // requests
        builder.<InviteAccountReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InviteAccountReqBody.class),
            f -> f.withMarshaller(InviteAccountRequest::getBody, InviteAccountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountsRequest, ListAccountsResponse> listAccounts = genForListAccounts();

    private static HttpRequestDef<ListAccountsRequest, ListAccountsResponse> genForListAccounts() {
        // basic
        HttpRequestDef.Builder<ListAccountsRequest, ListAccountsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAccountsRequest.class, ListAccountsResponse.class)
                .withName("ListAccounts")
                .withUri("/v1/organizations/accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsRequest::getParentId, ListAccountsRequest::setParentId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountsRequest::getLimit, ListAccountsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsRequest::getMarker, ListAccountsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloseAccountStatusesRequest, ListCloseAccountStatusesResponse> listCloseAccountStatuses =
        genForListCloseAccountStatuses();

    private static HttpRequestDef<ListCloseAccountStatusesRequest, ListCloseAccountStatusesResponse> genForListCloseAccountStatuses() {
        // basic
        HttpRequestDef.Builder<ListCloseAccountStatusesRequest, ListCloseAccountStatusesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListCloseAccountStatusesRequest.class, ListCloseAccountStatusesResponse.class)
                .withName("ListCloseAccountStatuses")
                .withUri("/v1/organizations/close-account-status")
                .withContentType("application/json");

        // requests
        builder.<List<ListCloseAccountStatusesRequest.StatesEnum>>withRequestField("states",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloseAccountStatusesRequest::getStates,
                ListCloseAccountStatusesRequest::setStates));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCreateAccountStatusesRequest, ListCreateAccountStatusesResponse> listCreateAccountStatuses =
        genForListCreateAccountStatuses();

    private static HttpRequestDef<ListCreateAccountStatusesRequest, ListCreateAccountStatusesResponse> genForListCreateAccountStatuses() {
        // basic
        HttpRequestDef.Builder<ListCreateAccountStatusesRequest, ListCreateAccountStatusesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCreateAccountStatusesRequest.class,
                    ListCreateAccountStatusesResponse.class)
                .withName("ListCreateAccountStatuses")
                .withUri("/v1/organizations/create-account-status")
                .withContentType("application/json");

        // requests
        builder.<List<ListCreateAccountStatusesRequest.StatesEnum>>withRequestField("states",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCreateAccountStatusesRequest::getStates,
                ListCreateAccountStatusesRequest::setStates));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCreateAccountStatusesRequest::getLimit,
                ListCreateAccountStatusesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCreateAccountStatusesRequest::getMarker,
                ListCreateAccountStatusesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MoveAccountRequest, MoveAccountResponse> moveAccount = genForMoveAccount();

    private static HttpRequestDef<MoveAccountRequest, MoveAccountResponse> genForMoveAccount() {
        // basic
        HttpRequestDef.Builder<MoveAccountRequest, MoveAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, MoveAccountRequest.class, MoveAccountResponse.class)
                .withName("MoveAccount")
                .withUri("/v1/organizations/accounts/{account_id}/move")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MoveAccountRequest::getAccountId, MoveAccountRequest::setAccountId));
        builder.<MoveAccountReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MoveAccountReqBody.class),
            f -> f.withMarshaller(MoveAccountRequest::getBody, MoveAccountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveAccountRequest, RemoveAccountResponse> removeAccount =
        genForRemoveAccount();

    private static HttpRequestDef<RemoveAccountRequest, RemoveAccountResponse> genForRemoveAccount() {
        // basic
        HttpRequestDef.Builder<RemoveAccountRequest, RemoveAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RemoveAccountRequest.class, RemoveAccountResponse.class)
                .withName("RemoveAccount")
                .withUri("/v1/organizations/accounts/{account_id}/remove")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveAccountRequest::getAccountId, RemoveAccountRequest::setAccountId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAccountRequest, ShowAccountResponse> showAccount = genForShowAccount();

    private static HttpRequestDef<ShowAccountRequest, ShowAccountResponse> genForShowAccount() {
        // basic
        HttpRequestDef.Builder<ShowAccountRequest, ShowAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAccountRequest.class, ShowAccountResponse.class)
                .withName("ShowAccount")
                .withUri("/v1/organizations/accounts/{account_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccountRequest::getAccountId, ShowAccountRequest::setAccountId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCreateAccountStatusRequest, ShowCreateAccountStatusResponse> showCreateAccountStatus =
        genForShowCreateAccountStatus();

    private static HttpRequestDef<ShowCreateAccountStatusRequest, ShowCreateAccountStatusResponse> genForShowCreateAccountStatus() {
        // basic
        HttpRequestDef.Builder<ShowCreateAccountStatusRequest, ShowCreateAccountStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowCreateAccountStatusRequest.class, ShowCreateAccountStatusResponse.class)
            .withName("ShowCreateAccountStatus")
            .withUri("/v1/organizations/create-account-status/{create_account_status_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("create_account_status_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCreateAccountStatusRequest::getCreateAccountStatusId,
                ShowCreateAccountStatusRequest::setCreateAccountStatusId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeregisterDelegatedAdministratorRequest, DeregisterDelegatedAdministratorResponse> deregisterDelegatedAdministrator =
        genForDeregisterDelegatedAdministrator();

    private static HttpRequestDef<DeregisterDelegatedAdministratorRequest, DeregisterDelegatedAdministratorResponse> genForDeregisterDelegatedAdministrator() {
        // basic
        HttpRequestDef.Builder<DeregisterDelegatedAdministratorRequest, DeregisterDelegatedAdministratorResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeregisterDelegatedAdministratorRequest.class,
                    DeregisterDelegatedAdministratorResponse.class)
                .withName("DeregisterDelegatedAdministrator")
                .withUri("/v1/organizations/delegated-administrators/deregister")
                .withContentType("application/json");

        // requests
        builder.<DelegatedAdministratorReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DelegatedAdministratorReqBody.class),
            f -> f.withMarshaller(DeregisterDelegatedAdministratorRequest::getBody,
                DeregisterDelegatedAdministratorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDelegatedAdministratorsRequest, ListDelegatedAdministratorsResponse> listDelegatedAdministrators =
        genForListDelegatedAdministrators();

    private static HttpRequestDef<ListDelegatedAdministratorsRequest, ListDelegatedAdministratorsResponse> genForListDelegatedAdministrators() {
        // basic
        HttpRequestDef.Builder<ListDelegatedAdministratorsRequest, ListDelegatedAdministratorsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDelegatedAdministratorsRequest.class,
                    ListDelegatedAdministratorsResponse.class)
                .withName("ListDelegatedAdministrators")
                .withUri("/v1/organizations/delegated-administrators")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_principal",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDelegatedAdministratorsRequest::getServicePrincipal,
                ListDelegatedAdministratorsRequest::setServicePrincipal));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDelegatedAdministratorsRequest::getLimit,
                ListDelegatedAdministratorsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDelegatedAdministratorsRequest::getMarker,
                ListDelegatedAdministratorsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDelegatedServicesRequest, ListDelegatedServicesResponse> listDelegatedServices =
        genForListDelegatedServices();

    private static HttpRequestDef<ListDelegatedServicesRequest, ListDelegatedServicesResponse> genForListDelegatedServices() {
        // basic
        HttpRequestDef.Builder<ListDelegatedServicesRequest, ListDelegatedServicesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDelegatedServicesRequest.class, ListDelegatedServicesResponse.class)
            .withName("ListDelegatedServices")
            .withUri("/v1/organizations/accounts/{account_id}/delegated-services")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDelegatedServicesRequest::getAccountId,
                ListDelegatedServicesRequest::setAccountId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDelegatedServicesRequest::getLimit, ListDelegatedServicesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDelegatedServicesRequest::getMarker, ListDelegatedServicesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterDelegatedAdministratorRequest, RegisterDelegatedAdministratorResponse> registerDelegatedAdministrator =
        genForRegisterDelegatedAdministrator();

    private static HttpRequestDef<RegisterDelegatedAdministratorRequest, RegisterDelegatedAdministratorResponse> genForRegisterDelegatedAdministrator() {
        // basic
        HttpRequestDef.Builder<RegisterDelegatedAdministratorRequest, RegisterDelegatedAdministratorResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RegisterDelegatedAdministratorRequest.class,
                    RegisterDelegatedAdministratorResponse.class)
                .withName("RegisterDelegatedAdministrator")
                .withUri("/v1/organizations/delegated-administrators/register")
                .withContentType("application/json");

        // requests
        builder.<DelegatedAdministratorReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DelegatedAdministratorReqBody.class),
            f -> f.withMarshaller(RegisterDelegatedAdministratorRequest::getBody,
                RegisterDelegatedAdministratorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AcceptHandshakeRequest, AcceptHandshakeResponse> acceptHandshake =
        genForAcceptHandshake();

    private static HttpRequestDef<AcceptHandshakeRequest, AcceptHandshakeResponse> genForAcceptHandshake() {
        // basic
        HttpRequestDef.Builder<AcceptHandshakeRequest, AcceptHandshakeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AcceptHandshakeRequest.class, AcceptHandshakeResponse.class)
                .withName("AcceptHandshake")
                .withUri("/v1/received-handshakes/{handshake_id}/accept")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("handshake_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptHandshakeRequest::getHandshakeId, AcceptHandshakeRequest::setHandshakeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelHandshakeRequest, CancelHandshakeResponse> cancelHandshake =
        genForCancelHandshake();

    private static HttpRequestDef<CancelHandshakeRequest, CancelHandshakeResponse> genForCancelHandshake() {
        // basic
        HttpRequestDef.Builder<CancelHandshakeRequest, CancelHandshakeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelHandshakeRequest.class, CancelHandshakeResponse.class)
                .withName("CancelHandshake")
                .withUri("/v1/organizations/handshakes/{handshake_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("handshake_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelHandshakeRequest::getHandshakeId, CancelHandshakeRequest::setHandshakeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeclineHandshakeRequest, DeclineHandshakeResponse> declineHandshake =
        genForDeclineHandshake();

    private static HttpRequestDef<DeclineHandshakeRequest, DeclineHandshakeResponse> genForDeclineHandshake() {
        // basic
        HttpRequestDef.Builder<DeclineHandshakeRequest, DeclineHandshakeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeclineHandshakeRequest.class, DeclineHandshakeResponse.class)
                .withName("DeclineHandshake")
                .withUri("/v1/received-handshakes/{handshake_id}/decline")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("handshake_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeclineHandshakeRequest::getHandshakeId, DeclineHandshakeRequest::setHandshakeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHandshakesRequest, ListHandshakesResponse> listHandshakes =
        genForListHandshakes();

    private static HttpRequestDef<ListHandshakesRequest, ListHandshakesResponse> genForListHandshakes() {
        // basic
        HttpRequestDef.Builder<ListHandshakesRequest, ListHandshakesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHandshakesRequest.class, ListHandshakesResponse.class)
                .withName("ListHandshakes")
                .withUri("/v1/organizations/handshakes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHandshakesRequest::getLimit, ListHandshakesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHandshakesRequest::getMarker, ListHandshakesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListReceivedHandshakesRequest, ListReceivedHandshakesResponse> listReceivedHandshakes =
        genForListReceivedHandshakes();

    private static HttpRequestDef<ListReceivedHandshakesRequest, ListReceivedHandshakesResponse> genForListReceivedHandshakes() {
        // basic
        HttpRequestDef.Builder<ListReceivedHandshakesRequest, ListReceivedHandshakesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListReceivedHandshakesRequest.class, ListReceivedHandshakesResponse.class)
            .withName("ListReceivedHandshakes")
            .withUri("/v1/received-handshakes")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListReceivedHandshakesRequest::getLimit, ListReceivedHandshakesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReceivedHandshakesRequest::getMarker, ListReceivedHandshakesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHandshakeRequest, ShowHandshakeResponse> showHandshake =
        genForShowHandshake();

    private static HttpRequestDef<ShowHandshakeRequest, ShowHandshakeResponse> genForShowHandshake() {
        // basic
        HttpRequestDef.Builder<ShowHandshakeRequest, ShowHandshakeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHandshakeRequest.class, ShowHandshakeResponse.class)
                .withName("ShowHandshake")
                .withUri("/v1/organizations/handshakes/{handshake_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("handshake_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHandshakeRequest::getHandshakeId, ShowHandshakeRequest::setHandshakeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEntitiesRequest, ListEntitiesResponse> listEntities = genForListEntities();

    private static HttpRequestDef<ListEntitiesRequest, ListEntitiesResponse> genForListEntities() {
        // basic
        HttpRequestDef.Builder<ListEntitiesRequest, ListEntitiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEntitiesRequest.class, ListEntitiesResponse.class)
                .withName("ListEntities")
                .withUri("/v1/organizations/entities")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEntitiesRequest::getParentId, ListEntitiesRequest::setParentId));
        builder.<String>withRequestField("child_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEntitiesRequest::getChildId, ListEntitiesRequest::setChildId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEntitiesRequest::getLimit, ListEntitiesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEntitiesRequest::getMarker, ListEntitiesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForListQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForListQuotas() {
        // basic
        HttpRequestDef.Builder<ListQuotasRequest, ListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotasRequest.class, ListQuotasResponse.class)
                .withName("ListQuotas")
                .withUri("/v1/organizations/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServicesRequest, ListServicesResponse> listServices = genForListServices();

    private static HttpRequestDef<ListServicesRequest, ListServicesResponse> genForListServices() {
        // basic
        HttpRequestDef.Builder<ListServicesRequest, ListServicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServicesRequest.class, ListServicesResponse.class)
                .withName("ListServices")
                .withUri("/v1/organizations/services")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagPolicyServicesRequest, ListTagPolicyServicesResponse> listTagPolicyServices =
        genForListTagPolicyServices();

    private static HttpRequestDef<ListTagPolicyServicesRequest, ListTagPolicyServicesResponse> genForListTagPolicyServices() {
        // basic
        HttpRequestDef.Builder<ListTagPolicyServicesRequest, ListTagPolicyServicesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTagPolicyServicesRequest.class, ListTagPolicyServicesResponse.class)
            .withName("ListTagPolicyServices")
            .withUri("/v1/organizations/tag-policy-services")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEffectivePoliciesRequest, ShowEffectivePoliciesResponse> showEffectivePolicies =
        genForShowEffectivePolicies();

    private static HttpRequestDef<ShowEffectivePoliciesRequest, ShowEffectivePoliciesResponse> genForShowEffectivePolicies() {
        // basic
        HttpRequestDef.Builder<ShowEffectivePoliciesRequest, ShowEffectivePoliciesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEffectivePoliciesRequest.class, ShowEffectivePoliciesResponse.class)
            .withName("ShowEffectivePolicies")
            .withUri("/v1/organizations/entities/effective-policies")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("entity_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEffectivePoliciesRequest::getEntityId,
                ShowEffectivePoliciesRequest::setEntityId));
        builder.<ShowEffectivePoliciesRequest.PolicyTypeEnum>withRequestField("policy_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowEffectivePoliciesRequest.PolicyTypeEnum.class),
            f -> f.withMarshaller(ShowEffectivePoliciesRequest::getPolicyType,
                ShowEffectivePoliciesRequest::setPolicyType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrganizationRequest, CreateOrganizationResponse> createOrganization =
        genForCreateOrganization();

    private static HttpRequestDef<CreateOrganizationRequest, CreateOrganizationResponse> genForCreateOrganization() {
        // basic
        HttpRequestDef.Builder<CreateOrganizationRequest, CreateOrganizationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOrganizationRequest.class, CreateOrganizationResponse.class)
                .withName("CreateOrganization")
                .withUri("/v1/organizations")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteOrganizationRequest, DeleteOrganizationResponse> deleteOrganization =
        genForDeleteOrganization();

    private static HttpRequestDef<DeleteOrganizationRequest, DeleteOrganizationResponse> genForDeleteOrganization() {
        // basic
        HttpRequestDef.Builder<DeleteOrganizationRequest, DeleteOrganizationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteOrganizationRequest.class, DeleteOrganizationResponse.class)
                .withName("DeleteOrganization")
                .withUri("/v1/organizations")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LeaveOrganizationRequest, LeaveOrganizationResponse> leaveOrganization =
        genForLeaveOrganization();

    private static HttpRequestDef<LeaveOrganizationRequest, LeaveOrganizationResponse> genForLeaveOrganization() {
        // basic
        HttpRequestDef.Builder<LeaveOrganizationRequest, LeaveOrganizationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LeaveOrganizationRequest.class, LeaveOrganizationResponse.class)
                .withName("LeaveOrganization")
                .withUri("/v1/organizations/leave")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRootsRequest, ListRootsResponse> listRoots = genForListRoots();

    private static HttpRequestDef<ListRootsRequest, ListRootsResponse> genForListRoots() {
        // basic
        HttpRequestDef.Builder<ListRootsRequest, ListRootsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRootsRequest.class, ListRootsResponse.class)
                .withName("ListRoots")
                .withUri("/v1/organizations/roots")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRootsRequest::getLimit, ListRootsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRootsRequest::getMarker, ListRootsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrganizationRequest, ShowOrganizationResponse> showOrganization =
        genForShowOrganization();

    private static HttpRequestDef<ShowOrganizationRequest, ShowOrganizationResponse> genForShowOrganization() {
        // basic
        HttpRequestDef.Builder<ShowOrganizationRequest, ShowOrganizationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOrganizationRequest.class, ShowOrganizationResponse.class)
                .withName("ShowOrganization")
                .withUri("/v1/organizations")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrganizationalUnitRequest, CreateOrganizationalUnitResponse> createOrganizationalUnit =
        genForCreateOrganizationalUnit();

    private static HttpRequestDef<CreateOrganizationalUnitRequest, CreateOrganizationalUnitResponse> genForCreateOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<CreateOrganizationalUnitRequest, CreateOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateOrganizationalUnitRequest.class, CreateOrganizationalUnitResponse.class)
                .withName("CreateOrganizationalUnit")
                .withUri("/v1/organizations/organizational-units")
                .withContentType("application/json");

        // requests
        builder.<CreateOrganizationalUnitReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOrganizationalUnitReqBody.class),
            f -> f.withMarshaller(CreateOrganizationalUnitRequest::getBody, CreateOrganizationalUnitRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteOrganizationalUnitRequest, DeleteOrganizationalUnitResponse> deleteOrganizationalUnit =
        genForDeleteOrganizationalUnit();

    private static HttpRequestDef<DeleteOrganizationalUnitRequest, DeleteOrganizationalUnitResponse> genForDeleteOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<DeleteOrganizationalUnitRequest, DeleteOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteOrganizationalUnitRequest.class,
                    DeleteOrganizationalUnitResponse.class)
                .withName("DeleteOrganizationalUnit")
                .withUri("/v1/organizations/organizational-units/{organizational_unit_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("organizational_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOrganizationalUnitRequest::getOrganizationalUnitId,
                DeleteOrganizationalUnitRequest::setOrganizationalUnitId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrganizationalUnitsRequest, ListOrganizationalUnitsResponse> listOrganizationalUnits =
        genForListOrganizationalUnits();

    private static HttpRequestDef<ListOrganizationalUnitsRequest, ListOrganizationalUnitsResponse> genForListOrganizationalUnits() {
        // basic
        HttpRequestDef.Builder<ListOrganizationalUnitsRequest, ListOrganizationalUnitsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListOrganizationalUnitsRequest.class, ListOrganizationalUnitsResponse.class)
            .withName("ListOrganizationalUnits")
            .withUri("/v1/organizations/organizational-units")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrganizationalUnitsRequest::getParentId,
                ListOrganizationalUnitsRequest::setParentId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOrganizationalUnitsRequest::getLimit, ListOrganizationalUnitsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrganizationalUnitsRequest::getMarker,
                ListOrganizationalUnitsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrganizationalUnitRequest, ShowOrganizationalUnitResponse> showOrganizationalUnit =
        genForShowOrganizationalUnit();

    private static HttpRequestDef<ShowOrganizationalUnitRequest, ShowOrganizationalUnitResponse> genForShowOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<ShowOrganizationalUnitRequest, ShowOrganizationalUnitResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowOrganizationalUnitRequest.class, ShowOrganizationalUnitResponse.class)
            .withName("ShowOrganizationalUnit")
            .withUri("/v1/organizations/organizational-units/{organizational_unit_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("organizational_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrganizationalUnitRequest::getOrganizationalUnitId,
                ShowOrganizationalUnitRequest::setOrganizationalUnitId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateOrganizationalUnitRequest, UpdateOrganizationalUnitResponse> updateOrganizationalUnit =
        genForUpdateOrganizationalUnit();

    private static HttpRequestDef<UpdateOrganizationalUnitRequest, UpdateOrganizationalUnitResponse> genForUpdateOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<UpdateOrganizationalUnitRequest, UpdateOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PATCH,
                    UpdateOrganizationalUnitRequest.class,
                    UpdateOrganizationalUnitResponse.class)
                .withName("UpdateOrganizationalUnit")
                .withUri("/v1/organizations/organizational-units/{organizational_unit_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("organizational_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateOrganizationalUnitRequest::getOrganizationalUnitId,
                UpdateOrganizationalUnitRequest::setOrganizationalUnitId));
        builder.<UpdateOrganizationalUnitReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateOrganizationalUnitReqBody.class),
            f -> f.withMarshaller(UpdateOrganizationalUnitRequest::getBody, UpdateOrganizationalUnitRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachPolicyRequest, AttachPolicyResponse> attachPolicy = genForAttachPolicy();

    private static HttpRequestDef<AttachPolicyRequest, AttachPolicyResponse> genForAttachPolicy() {
        // basic
        HttpRequestDef.Builder<AttachPolicyRequest, AttachPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachPolicyRequest.class, AttachPolicyResponse.class)
                .withName("AttachPolicy")
                .withUri("/v1/organizations/policies/{policy_id}/attach")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachPolicyRequest::getPolicyId, AttachPolicyRequest::setPolicyId));
        builder.<PolicyTachReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PolicyTachReqBody.class),
            f -> f.withMarshaller(AttachPolicyRequest::getBody, AttachPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> createPolicy = genForCreatePolicy();

    private static HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> genForCreatePolicy() {
        // basic
        HttpRequestDef.Builder<CreatePolicyRequest, CreatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePolicyRequest.class, CreatePolicyResponse.class)
                .withName("CreatePolicy")
                .withUri("/v1/organizations/policies")
                .withContentType("application/json");

        // requests
        builder.<CreatePolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatePolicyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreatePolicyRequest::getXLanguage, CreatePolicyRequest::setXLanguage));
        builder.<CreatePolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePolicyReqBody.class),
            f -> f.withMarshaller(CreatePolicyRequest::getBody, CreatePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> deletePolicy = genForDeletePolicy();

    private static HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> genForDeletePolicy() {
        // basic
        HttpRequestDef.Builder<DeletePolicyRequest, DeletePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePolicyRequest.class, DeletePolicyResponse.class)
                .withName("DeletePolicy")
                .withUri("/v1/organizations/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getPolicyId, DeletePolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachPolicyRequest, DetachPolicyResponse> detachPolicy = genForDetachPolicy();

    private static HttpRequestDef<DetachPolicyRequest, DetachPolicyResponse> genForDetachPolicy() {
        // basic
        HttpRequestDef.Builder<DetachPolicyRequest, DetachPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetachPolicyRequest.class, DetachPolicyResponse.class)
                .withName("DetachPolicy")
                .withUri("/v1/organizations/policies/{policy_id}/detach")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachPolicyRequest::getPolicyId, DetachPolicyRequest::setPolicyId));
        builder.<PolicyTachReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PolicyTachReqBody.class),
            f -> f.withMarshaller(DetachPolicyRequest::getBody, DetachPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisablePolicyTypeRequest, DisablePolicyTypeResponse> disablePolicyType =
        genForDisablePolicyType();

    private static HttpRequestDef<DisablePolicyTypeRequest, DisablePolicyTypeResponse> genForDisablePolicyType() {
        // basic
        HttpRequestDef.Builder<DisablePolicyTypeRequest, DisablePolicyTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisablePolicyTypeRequest.class, DisablePolicyTypeResponse.class)
                .withName("DisablePolicyType")
                .withUri("/v1/organizations/policies/disable")
                .withContentType("application/json");

        // requests
        builder.<PolicyTypeReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PolicyTypeReqBody.class),
            f -> f.withMarshaller(DisablePolicyTypeRequest::getBody, DisablePolicyTypeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnablePolicyTypeRequest, EnablePolicyTypeResponse> enablePolicyType =
        genForEnablePolicyType();

    private static HttpRequestDef<EnablePolicyTypeRequest, EnablePolicyTypeResponse> genForEnablePolicyType() {
        // basic
        HttpRequestDef.Builder<EnablePolicyTypeRequest, EnablePolicyTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnablePolicyTypeRequest.class, EnablePolicyTypeResponse.class)
                .withName("EnablePolicyType")
                .withUri("/v1/organizations/policies/enable")
                .withContentType("application/json");

        // requests
        builder.<PolicyTypeReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PolicyTypeReqBody.class),
            f -> f.withMarshaller(EnablePolicyTypeRequest::getBody, EnablePolicyTypeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEntitiesForPolicyRequest, ListEntitiesForPolicyResponse> listEntitiesForPolicy =
        genForListEntitiesForPolicy();

    private static HttpRequestDef<ListEntitiesForPolicyRequest, ListEntitiesForPolicyResponse> genForListEntitiesForPolicy() {
        // basic
        HttpRequestDef.Builder<ListEntitiesForPolicyRequest, ListEntitiesForPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEntitiesForPolicyRequest.class, ListEntitiesForPolicyResponse.class)
            .withName("ListEntitiesForPolicy")
            .withUri("/v1/organizations/policies/{policy_id}/attached-entities")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEntitiesForPolicyRequest::getPolicyId,
                ListEntitiesForPolicyRequest::setPolicyId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEntitiesForPolicyRequest::getLimit, ListEntitiesForPolicyRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEntitiesForPolicyRequest::getMarker, ListEntitiesForPolicyRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoliciesRequest, ListPoliciesResponse> listPolicies = genForListPolicies();

    private static HttpRequestDef<ListPoliciesRequest, ListPoliciesResponse> genForListPolicies() {
        // basic
        HttpRequestDef.Builder<ListPoliciesRequest, ListPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoliciesRequest.class, ListPoliciesResponse.class)
                .withName("ListPolicies")
                .withUri("/v1/organizations/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("attached_entity_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoliciesRequest::getAttachedEntityId, ListPoliciesRequest::setAttachedEntityId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoliciesRequest::getLimit, ListPoliciesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoliciesRequest::getMarker, ListPoliciesRequest::setMarker));
        builder.<ListPoliciesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPoliciesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListPoliciesRequest::getXLanguage, ListPoliciesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> showPolicy = genForShowPolicy();

    private static HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> genForShowPolicy() {
        // basic
        HttpRequestDef.Builder<ShowPolicyRequest, ShowPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPolicyRequest.class, ShowPolicyResponse.class)
                .withName("ShowPolicy")
                .withUri("/v1/organizations/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyRequest::getPolicyId, ShowPolicyRequest::setPolicyId));
        builder.<ShowPolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowPolicyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowPolicyRequest::getXLanguage, ShowPolicyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicy = genForUpdatePolicy();

    private static HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> genForUpdatePolicy() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyRequest, UpdatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdatePolicyRequest.class, UpdatePolicyResponse.class)
                .withName("UpdatePolicy")
                .withUri("/v1/organizations/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getPolicyId, UpdatePolicyRequest::setPolicyId));
        builder.<UpdatePolicyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePolicyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getXLanguage, UpdatePolicyRequest::setXLanguage));
        builder.<UpdatePolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyReqBody.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getBody, UpdatePolicyRequest::setBody));

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
                .withUri("/v1/organizations/{resource_type}/{resource_id}/tags/create")
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
                .withUri("/v1/organizations/{resource_type}/{resource_id}/tags/delete")
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
        builder.<TagResourceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceReqBody.class),
            f -> f.withMarshaller(DeleteTagResourceRequest::getBody, DeleteTagResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstances =
        genForListResourceInstances();

    private static HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> genForListResourceInstances() {
        // basic
        HttpRequestDef.Builder<ListResourceInstancesRequest, ListResourceInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListResourceInstancesRequest.class, ListResourceInstancesResponse.class)
            .withName("ListResourceInstances")
            .withUri("/v1/organizations/{resource_type}/resource-instances/filter")
            .withContentType("application/json");

        // requests
        builder.<ListResourceInstancesRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getResourceType,
                ListResourceInstancesRequest::setResourceType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getLimit, ListResourceInstancesRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getOffset, ListResourceInstancesRequest::setOffset));
        builder.<ResourceInstanceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceInstanceReqBody.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getBody, ListResourceInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTags =
        genForListResourceTags();

    private static HttpRequestDef<ListResourceTagsRequest, ListResourceTagsResponse> genForListResourceTags() {
        // basic
        HttpRequestDef.Builder<ListResourceTagsRequest, ListResourceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceTagsRequest.class, ListResourceTagsResponse.class)
                .withName("ListResourceTags")
                .withUri("/v1/organizations/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListResourceTagsRequest::getResourceType, ListResourceTagsRequest::setResourceType));

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
                .withUri("/v1/organizations/{resource_type}/{resource_id}/tags")
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

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsForResourceRequest, ListTagsForResourceResponse> listTagsForResource =
        genForListTagsForResource();

    private static HttpRequestDef<ListTagsForResourceRequest, ListTagsForResourceResponse> genForListTagsForResource() {
        // basic
        HttpRequestDef.Builder<ListTagsForResourceRequest, ListTagsForResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsForResourceRequest.class, ListTagsForResourceResponse.class)
                .withName("ListTagsForResource")
                .withUri("/v1/organizations/resources/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsForResourceRequest::getResourceId,
                ListTagsForResourceRequest::setResourceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagsForResourceRequest::getLimit, ListTagsForResourceRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsForResourceRequest::getMarker, ListTagsForResourceRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceInstancesCountRequest, ShowResourceInstancesCountResponse> showResourceInstancesCount =
        genForShowResourceInstancesCount();

    private static HttpRequestDef<ShowResourceInstancesCountRequest, ShowResourceInstancesCountResponse> genForShowResourceInstancesCount() {
        // basic
        HttpRequestDef.Builder<ShowResourceInstancesCountRequest, ShowResourceInstancesCountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowResourceInstancesCountRequest.class,
                    ShowResourceInstancesCountResponse.class)
                .withName("ShowResourceInstancesCount")
                .withUri("/v1/organizations/{resource_type}/resource-instances/count")
                .withContentType("application/json");

        // requests
        builder.<ShowResourceInstancesCountRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowResourceInstancesCountRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ShowResourceInstancesCountRequest::getResourceType,
                ShowResourceInstancesCountRequest::setResourceType));
        builder.<ResourceInstanceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceInstanceReqBody.class),
            f -> f.withMarshaller(ShowResourceInstancesCountRequest::getBody,
                ShowResourceInstancesCountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TagResourceRequest, TagResourceResponse> tagResource = genForTagResource();

    private static HttpRequestDef<TagResourceRequest, TagResourceResponse> genForTagResource() {
        // basic
        HttpRequestDef.Builder<TagResourceRequest, TagResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, TagResourceRequest.class, TagResourceResponse.class)
                .withName("TagResource")
                .withUri("/v1/organizations/resources/{resource_id}/tag")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TagResourceRequest::getResourceId, TagResourceRequest::setResourceId));
        builder.<TagResourceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceReqBody.class),
            f -> f.withMarshaller(TagResourceRequest::getBody, TagResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UntagResourceRequest, UntagResourceResponse> untagResource =
        genForUntagResource();

    private static HttpRequestDef<UntagResourceRequest, UntagResourceResponse> genForUntagResource() {
        // basic
        HttpRequestDef.Builder<UntagResourceRequest, UntagResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UntagResourceRequest.class, UntagResourceResponse.class)
                .withName("UntagResource")
                .withUri("/v1/organizations/resources/{resource_id}/untag")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UntagResourceRequest::getResourceId, UntagResourceRequest::setResourceId));
        builder.<UntagResourceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UntagResourceReqBody.class),
            f -> f.withMarshaller(UntagResourceRequest::getBody, UntagResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableTrustedServiceRequest, DisableTrustedServiceResponse> disableTrustedService =
        genForDisableTrustedService();

    private static HttpRequestDef<DisableTrustedServiceRequest, DisableTrustedServiceResponse> genForDisableTrustedService() {
        // basic
        HttpRequestDef.Builder<DisableTrustedServiceRequest, DisableTrustedServiceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DisableTrustedServiceRequest.class, DisableTrustedServiceResponse.class)
            .withName("DisableTrustedService")
            .withUri("/v1/organizations/trusted-services/disable")
            .withContentType("application/json");

        // requests
        builder.<TrustedServiceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TrustedServiceReqBody.class),
            f -> f.withMarshaller(DisableTrustedServiceRequest::getBody, DisableTrustedServiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableTrustedServiceRequest, EnableTrustedServiceResponse> enableTrustedService =
        genForEnableTrustedService();

    private static HttpRequestDef<EnableTrustedServiceRequest, EnableTrustedServiceResponse> genForEnableTrustedService() {
        // basic
        HttpRequestDef.Builder<EnableTrustedServiceRequest, EnableTrustedServiceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, EnableTrustedServiceRequest.class, EnableTrustedServiceResponse.class)
            .withName("EnableTrustedService")
            .withUri("/v1/organizations/trusted-services/enable")
            .withContentType("application/json");

        // requests
        builder.<TrustedServiceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TrustedServiceReqBody.class),
            f -> f.withMarshaller(EnableTrustedServiceRequest::getBody, EnableTrustedServiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTrustedServicesRequest, ListTrustedServicesResponse> listTrustedServices =
        genForListTrustedServices();

    private static HttpRequestDef<ListTrustedServicesRequest, ListTrustedServicesResponse> genForListTrustedServices() {
        // basic
        HttpRequestDef.Builder<ListTrustedServicesRequest, ListTrustedServicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTrustedServicesRequest.class, ListTrustedServicesResponse.class)
                .withName("ListTrustedServices")
                .withUri("/v1/organizations/trusted-services")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTrustedServicesRequest::getLimit, ListTrustedServicesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrustedServicesRequest::getMarker, ListTrustedServicesRequest::setMarker));

        // response

        return builder.build();
    }

}
