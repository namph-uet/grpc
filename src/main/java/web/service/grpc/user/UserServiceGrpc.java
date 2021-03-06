package web.service.grpc.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<web.service.grpc.user.RegistrationRequestGrpc,
      web.service.grpc.user.RegistrationResponseGrpc> getRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Registration",
      requestType = web.service.grpc.user.RegistrationRequestGrpc.class,
      responseType = web.service.grpc.user.RegistrationResponseGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.user.RegistrationRequestGrpc,
      web.service.grpc.user.RegistrationResponseGrpc> getRegistrationMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.user.RegistrationRequestGrpc, web.service.grpc.user.RegistrationResponseGrpc> getRegistrationMethod;
    if ((getRegistrationMethod = UserServiceGrpc.getRegistrationMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRegistrationMethod = UserServiceGrpc.getRegistrationMethod) == null) {
          UserServiceGrpc.getRegistrationMethod = getRegistrationMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.user.RegistrationRequestGrpc, web.service.grpc.user.RegistrationResponseGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "Registration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.RegistrationRequestGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.RegistrationResponseGrpc.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Registration"))
                  .build();
          }
        }
     }
     return getRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.grpc.user.LoginRequest,
      web.service.grpc.user.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = web.service.grpc.user.LoginRequest.class,
      responseType = web.service.grpc.user.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.user.LoginRequest,
      web.service.grpc.user.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.user.LoginRequest, web.service.grpc.user.LoginResponse> getLoginMethod;
    if ((getLoginMethod = UserServiceGrpc.getLoginMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getLoginMethod = UserServiceGrpc.getLoginMethod) == null) {
          UserServiceGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.user.LoginRequest, web.service.grpc.user.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.LoginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.grpc.user.ConfirmEmailRequest,
      web.service.grpc.user.ConfirmEmailResponse> getVerificationTokenRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerificationTokenRegistration",
      requestType = web.service.grpc.user.ConfirmEmailRequest.class,
      responseType = web.service.grpc.user.ConfirmEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.user.ConfirmEmailRequest,
      web.service.grpc.user.ConfirmEmailResponse> getVerificationTokenRegistrationMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.user.ConfirmEmailRequest, web.service.grpc.user.ConfirmEmailResponse> getVerificationTokenRegistrationMethod;
    if ((getVerificationTokenRegistrationMethod = UserServiceGrpc.getVerificationTokenRegistrationMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getVerificationTokenRegistrationMethod = UserServiceGrpc.getVerificationTokenRegistrationMethod) == null) {
          UserServiceGrpc.getVerificationTokenRegistrationMethod = getVerificationTokenRegistrationMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.user.ConfirmEmailRequest, web.service.grpc.user.ConfirmEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "VerificationTokenRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.ConfirmEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.ConfirmEmailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("VerificationTokenRegistration"))
                  .build();
          }
        }
     }
     return getVerificationTokenRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.grpc.user.PasswordResetRequest,
      web.service.grpc.user.PasswordResetResponse> getPasswordForgotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PasswordForgot",
      requestType = web.service.grpc.user.PasswordResetRequest.class,
      responseType = web.service.grpc.user.PasswordResetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.user.PasswordResetRequest,
      web.service.grpc.user.PasswordResetResponse> getPasswordForgotMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.user.PasswordResetRequest, web.service.grpc.user.PasswordResetResponse> getPasswordForgotMethod;
    if ((getPasswordForgotMethod = UserServiceGrpc.getPasswordForgotMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getPasswordForgotMethod = UserServiceGrpc.getPasswordForgotMethod) == null) {
          UserServiceGrpc.getPasswordForgotMethod = getPasswordForgotMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.user.PasswordResetRequest, web.service.grpc.user.PasswordResetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "PasswordForgot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.PasswordResetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.PasswordResetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("PasswordForgot"))
                  .build();
          }
        }
     }
     return getPasswordForgotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.grpc.user.NewPasswordRequest,
      web.service.grpc.user.NewPasswordResponse> getPasswordResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PasswordReset",
      requestType = web.service.grpc.user.NewPasswordRequest.class,
      responseType = web.service.grpc.user.NewPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.user.NewPasswordRequest,
      web.service.grpc.user.NewPasswordResponse> getPasswordResetMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.user.NewPasswordRequest, web.service.grpc.user.NewPasswordResponse> getPasswordResetMethod;
    if ((getPasswordResetMethod = UserServiceGrpc.getPasswordResetMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getPasswordResetMethod = UserServiceGrpc.getPasswordResetMethod) == null) {
          UserServiceGrpc.getPasswordResetMethod = getPasswordResetMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.user.NewPasswordRequest, web.service.grpc.user.NewPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "PasswordReset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.NewPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.NewPasswordResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("PasswordReset"))
                  .build();
          }
        }
     }
     return getPasswordResetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.grpc.user.RegistrationInformationRequest,
      web.service.grpc.user.RegistrationInformationResponse> getRegistrationInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegistrationInformation",
      requestType = web.service.grpc.user.RegistrationInformationRequest.class,
      responseType = web.service.grpc.user.RegistrationInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.user.RegistrationInformationRequest,
      web.service.grpc.user.RegistrationInformationResponse> getRegistrationInformationMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.user.RegistrationInformationRequest, web.service.grpc.user.RegistrationInformationResponse> getRegistrationInformationMethod;
    if ((getRegistrationInformationMethod = UserServiceGrpc.getRegistrationInformationMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRegistrationInformationMethod = UserServiceGrpc.getRegistrationInformationMethod) == null) {
          UserServiceGrpc.getRegistrationInformationMethod = getRegistrationInformationMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.user.RegistrationInformationRequest, web.service.grpc.user.RegistrationInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "RegistrationInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.RegistrationInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.RegistrationInformationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RegistrationInformation"))
                  .build();
          }
        }
     }
     return getRegistrationInformationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.grpc.user.VerificationResetPasswordTokenRequest,
      web.service.grpc.user.VerificationResetPasswordTokenResponse> getVerificationResetPasswordTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerificationResetPasswordToken",
      requestType = web.service.grpc.user.VerificationResetPasswordTokenRequest.class,
      responseType = web.service.grpc.user.VerificationResetPasswordTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.user.VerificationResetPasswordTokenRequest,
      web.service.grpc.user.VerificationResetPasswordTokenResponse> getVerificationResetPasswordTokenMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.user.VerificationResetPasswordTokenRequest, web.service.grpc.user.VerificationResetPasswordTokenResponse> getVerificationResetPasswordTokenMethod;
    if ((getVerificationResetPasswordTokenMethod = UserServiceGrpc.getVerificationResetPasswordTokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getVerificationResetPasswordTokenMethod = UserServiceGrpc.getVerificationResetPasswordTokenMethod) == null) {
          UserServiceGrpc.getVerificationResetPasswordTokenMethod = getVerificationResetPasswordTokenMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.user.VerificationResetPasswordTokenRequest, web.service.grpc.user.VerificationResetPasswordTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "VerificationResetPasswordToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.VerificationResetPasswordTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.VerificationResetPasswordTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("VerificationResetPasswordToken"))
                  .build();
          }
        }
     }
     return getVerificationResetPasswordTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.grpc.user.GetEmailRequest,
      web.service.grpc.user.GetEmailResponse> getGetEmailFromTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmailFromToken",
      requestType = web.service.grpc.user.GetEmailRequest.class,
      responseType = web.service.grpc.user.GetEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.user.GetEmailRequest,
      web.service.grpc.user.GetEmailResponse> getGetEmailFromTokenMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.user.GetEmailRequest, web.service.grpc.user.GetEmailResponse> getGetEmailFromTokenMethod;
    if ((getGetEmailFromTokenMethod = UserServiceGrpc.getGetEmailFromTokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetEmailFromTokenMethod = UserServiceGrpc.getGetEmailFromTokenMethod) == null) {
          UserServiceGrpc.getGetEmailFromTokenMethod = getGetEmailFromTokenMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.user.GetEmailRequest, web.service.grpc.user.GetEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "GetEmailFromToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.GetEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.GetEmailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetEmailFromToken"))
                  .build();
          }
        }
     }
     return getGetEmailFromTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.grpc.user.ValidateTokenRequest,
      web.service.grpc.user.ValidateTokenResponse> getValidateTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateToken",
      requestType = web.service.grpc.user.ValidateTokenRequest.class,
      responseType = web.service.grpc.user.ValidateTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.user.ValidateTokenRequest,
      web.service.grpc.user.ValidateTokenResponse> getValidateTokenMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.user.ValidateTokenRequest, web.service.grpc.user.ValidateTokenResponse> getValidateTokenMethod;
    if ((getValidateTokenMethod = UserServiceGrpc.getValidateTokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getValidateTokenMethod = UserServiceGrpc.getValidateTokenMethod) == null) {
          UserServiceGrpc.getValidateTokenMethod = getValidateTokenMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.user.ValidateTokenRequest, web.service.grpc.user.ValidateTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "ValidateToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.ValidateTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.ValidateTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ValidateToken"))
                  .build();
          }
        }
     }
     return getValidateTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.grpc.user.GetAllUserRequest,
      web.service.grpc.user.GetAllUserResponse> getGetAllUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllUser",
      requestType = web.service.grpc.user.GetAllUserRequest.class,
      responseType = web.service.grpc.user.GetAllUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.grpc.user.GetAllUserRequest,
      web.service.grpc.user.GetAllUserResponse> getGetAllUserMethod() {
    io.grpc.MethodDescriptor<web.service.grpc.user.GetAllUserRequest, web.service.grpc.user.GetAllUserResponse> getGetAllUserMethod;
    if ((getGetAllUserMethod = UserServiceGrpc.getGetAllUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAllUserMethod = UserServiceGrpc.getGetAllUserMethod) == null) {
          UserServiceGrpc.getGetAllUserMethod = getGetAllUserMethod = 
              io.grpc.MethodDescriptor.<web.service.grpc.user.GetAllUserRequest, web.service.grpc.user.GetAllUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "GetAllUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.GetAllUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.grpc.user.GetAllUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAllUser"))
                  .build();
          }
        }
     }
     return getGetAllUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * create a new account, save new email, password and send verification email
     * </pre>
     */
    public void registration(web.service.grpc.user.RegistrationRequestGrpc request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.RegistrationResponseGrpc> responseObserver) {
      asyncUnimplementedUnaryCall(getRegistrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * login account
     * </pre>
     */
    public void login(web.service.grpc.user.LoginRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     * Verify email
     * </pre>
     */
    public void verificationTokenRegistration(web.service.grpc.user.ConfirmEmailRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.ConfirmEmailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVerificationTokenRegistrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * send reset password email
     * </pre>
     */
    public void passwordForgot(web.service.grpc.user.PasswordResetRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.PasswordResetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPasswordForgotMethod(), responseObserver);
    }

    /**
     * <pre>
     * save new password
     * </pre>
     */
    public void passwordReset(web.service.grpc.user.NewPasswordRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.NewPasswordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPasswordResetMethod(), responseObserver);
    }

    /**
     * <pre>
     * register account's information
     * </pre>
     */
    public void registrationInformation(web.service.grpc.user.RegistrationInformationRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.RegistrationInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegistrationInformationMethod(), responseObserver);
    }

    /**
     * <pre>
     * verify reset password token
     * </pre>
     */
    public void verificationResetPasswordToken(web.service.grpc.user.VerificationResetPasswordTokenRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.VerificationResetPasswordTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVerificationResetPasswordTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * filter controller call to user service
     * </pre>
     */
    public void getEmailFromToken(web.service.grpc.user.GetEmailRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.GetEmailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEmailFromTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     *validate toke
     * </pre>
     */
    public void validateToken(web.service.grpc.user.ValidateTokenRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.ValidateTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidateTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * get all user
     * </pre>
     */
    public void getAllUser(web.service.grpc.user.GetAllUserRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.GetAllUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegistrationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.user.RegistrationRequestGrpc,
                web.service.grpc.user.RegistrationResponseGrpc>(
                  this, METHODID_REGISTRATION)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.user.LoginRequest,
                web.service.grpc.user.LoginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getVerificationTokenRegistrationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.user.ConfirmEmailRequest,
                web.service.grpc.user.ConfirmEmailResponse>(
                  this, METHODID_VERIFICATION_TOKEN_REGISTRATION)))
          .addMethod(
            getPasswordForgotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.user.PasswordResetRequest,
                web.service.grpc.user.PasswordResetResponse>(
                  this, METHODID_PASSWORD_FORGOT)))
          .addMethod(
            getPasswordResetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.user.NewPasswordRequest,
                web.service.grpc.user.NewPasswordResponse>(
                  this, METHODID_PASSWORD_RESET)))
          .addMethod(
            getRegistrationInformationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.user.RegistrationInformationRequest,
                web.service.grpc.user.RegistrationInformationResponse>(
                  this, METHODID_REGISTRATION_INFORMATION)))
          .addMethod(
            getVerificationResetPasswordTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.user.VerificationResetPasswordTokenRequest,
                web.service.grpc.user.VerificationResetPasswordTokenResponse>(
                  this, METHODID_VERIFICATION_RESET_PASSWORD_TOKEN)))
          .addMethod(
            getGetEmailFromTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.user.GetEmailRequest,
                web.service.grpc.user.GetEmailResponse>(
                  this, METHODID_GET_EMAIL_FROM_TOKEN)))
          .addMethod(
            getValidateTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.user.ValidateTokenRequest,
                web.service.grpc.user.ValidateTokenResponse>(
                  this, METHODID_VALIDATE_TOKEN)))
          .addMethod(
            getGetAllUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.grpc.user.GetAllUserRequest,
                web.service.grpc.user.GetAllUserResponse>(
                  this, METHODID_GET_ALL_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * create a new account, save new email, password and send verification email
     * </pre>
     */
    public void registration(web.service.grpc.user.RegistrationRequestGrpc request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.RegistrationResponseGrpc> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * login account
     * </pre>
     */
    public void login(web.service.grpc.user.LoginRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Verify email
     * </pre>
     */
    public void verificationTokenRegistration(web.service.grpc.user.ConfirmEmailRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.ConfirmEmailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerificationTokenRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * send reset password email
     * </pre>
     */
    public void passwordForgot(web.service.grpc.user.PasswordResetRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.PasswordResetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPasswordForgotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * save new password
     * </pre>
     */
    public void passwordReset(web.service.grpc.user.NewPasswordRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.NewPasswordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPasswordResetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * register account's information
     * </pre>
     */
    public void registrationInformation(web.service.grpc.user.RegistrationInformationRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.RegistrationInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegistrationInformationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * verify reset password token
     * </pre>
     */
    public void verificationResetPasswordToken(web.service.grpc.user.VerificationResetPasswordTokenRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.VerificationResetPasswordTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerificationResetPasswordTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * filter controller call to user service
     * </pre>
     */
    public void getEmailFromToken(web.service.grpc.user.GetEmailRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.GetEmailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEmailFromTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *validate toke
     * </pre>
     */
    public void validateToken(web.service.grpc.user.ValidateTokenRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.ValidateTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidateTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get all user
     * </pre>
     */
    public void getAllUser(web.service.grpc.user.GetAllUserRequest request,
        io.grpc.stub.StreamObserver<web.service.grpc.user.GetAllUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * create a new account, save new email, password and send verification email
     * </pre>
     */
    public web.service.grpc.user.RegistrationResponseGrpc registration(web.service.grpc.user.RegistrationRequestGrpc request) {
      return blockingUnaryCall(
          getChannel(), getRegistrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * login account
     * </pre>
     */
    public web.service.grpc.user.LoginResponse login(web.service.grpc.user.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Verify email
     * </pre>
     */
    public web.service.grpc.user.ConfirmEmailResponse verificationTokenRegistration(web.service.grpc.user.ConfirmEmailRequest request) {
      return blockingUnaryCall(
          getChannel(), getVerificationTokenRegistrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * send reset password email
     * </pre>
     */
    public web.service.grpc.user.PasswordResetResponse passwordForgot(web.service.grpc.user.PasswordResetRequest request) {
      return blockingUnaryCall(
          getChannel(), getPasswordForgotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * save new password
     * </pre>
     */
    public web.service.grpc.user.NewPasswordResponse passwordReset(web.service.grpc.user.NewPasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getPasswordResetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * register account's information
     * </pre>
     */
    public web.service.grpc.user.RegistrationInformationResponse registrationInformation(web.service.grpc.user.RegistrationInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegistrationInformationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * verify reset password token
     * </pre>
     */
    public web.service.grpc.user.VerificationResetPasswordTokenResponse verificationResetPasswordToken(web.service.grpc.user.VerificationResetPasswordTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getVerificationResetPasswordTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * filter controller call to user service
     * </pre>
     */
    public web.service.grpc.user.GetEmailResponse getEmailFromToken(web.service.grpc.user.GetEmailRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEmailFromTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *validate toke
     * </pre>
     */
    public web.service.grpc.user.ValidateTokenResponse validateToken(web.service.grpc.user.ValidateTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidateTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get all user
     * </pre>
     */
    public web.service.grpc.user.GetAllUserResponse getAllUser(web.service.grpc.user.GetAllUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * create a new account, save new email, password and send verification email
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.user.RegistrationResponseGrpc> registration(
        web.service.grpc.user.RegistrationRequestGrpc request) {
      return futureUnaryCall(
          getChannel().newCall(getRegistrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * login account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.user.LoginResponse> login(
        web.service.grpc.user.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Verify email
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.user.ConfirmEmailResponse> verificationTokenRegistration(
        web.service.grpc.user.ConfirmEmailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVerificationTokenRegistrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * send reset password email
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.user.PasswordResetResponse> passwordForgot(
        web.service.grpc.user.PasswordResetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPasswordForgotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * save new password
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.user.NewPasswordResponse> passwordReset(
        web.service.grpc.user.NewPasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPasswordResetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * register account's information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.user.RegistrationInformationResponse> registrationInformation(
        web.service.grpc.user.RegistrationInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegistrationInformationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * verify reset password token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.user.VerificationResetPasswordTokenResponse> verificationResetPasswordToken(
        web.service.grpc.user.VerificationResetPasswordTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVerificationResetPasswordTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * filter controller call to user service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.user.GetEmailResponse> getEmailFromToken(
        web.service.grpc.user.GetEmailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEmailFromTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *validate toke
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.user.ValidateTokenResponse> validateToken(
        web.service.grpc.user.ValidateTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidateTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get all user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.grpc.user.GetAllUserResponse> getAllUser(
        web.service.grpc.user.GetAllUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTRATION = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_VERIFICATION_TOKEN_REGISTRATION = 2;
  private static final int METHODID_PASSWORD_FORGOT = 3;
  private static final int METHODID_PASSWORD_RESET = 4;
  private static final int METHODID_REGISTRATION_INFORMATION = 5;
  private static final int METHODID_VERIFICATION_RESET_PASSWORD_TOKEN = 6;
  private static final int METHODID_GET_EMAIL_FROM_TOKEN = 7;
  private static final int METHODID_VALIDATE_TOKEN = 8;
  private static final int METHODID_GET_ALL_USER = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTRATION:
          serviceImpl.registration((web.service.grpc.user.RegistrationRequestGrpc) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.user.RegistrationResponseGrpc>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((web.service.grpc.user.LoginRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.user.LoginResponse>) responseObserver);
          break;
        case METHODID_VERIFICATION_TOKEN_REGISTRATION:
          serviceImpl.verificationTokenRegistration((web.service.grpc.user.ConfirmEmailRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.user.ConfirmEmailResponse>) responseObserver);
          break;
        case METHODID_PASSWORD_FORGOT:
          serviceImpl.passwordForgot((web.service.grpc.user.PasswordResetRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.user.PasswordResetResponse>) responseObserver);
          break;
        case METHODID_PASSWORD_RESET:
          serviceImpl.passwordReset((web.service.grpc.user.NewPasswordRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.user.NewPasswordResponse>) responseObserver);
          break;
        case METHODID_REGISTRATION_INFORMATION:
          serviceImpl.registrationInformation((web.service.grpc.user.RegistrationInformationRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.user.RegistrationInformationResponse>) responseObserver);
          break;
        case METHODID_VERIFICATION_RESET_PASSWORD_TOKEN:
          serviceImpl.verificationResetPasswordToken((web.service.grpc.user.VerificationResetPasswordTokenRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.user.VerificationResetPasswordTokenResponse>) responseObserver);
          break;
        case METHODID_GET_EMAIL_FROM_TOKEN:
          serviceImpl.getEmailFromToken((web.service.grpc.user.GetEmailRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.user.GetEmailResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_TOKEN:
          serviceImpl.validateToken((web.service.grpc.user.ValidateTokenRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.user.ValidateTokenResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_USER:
          serviceImpl.getAllUser((web.service.grpc.user.GetAllUserRequest) request,
              (io.grpc.stub.StreamObserver<web.service.grpc.user.GetAllUserResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return web.service.grpc.user.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getRegistrationMethod())
              .addMethod(getLoginMethod())
              .addMethod(getVerificationTokenRegistrationMethod())
              .addMethod(getPasswordForgotMethod())
              .addMethod(getPasswordResetMethod())
              .addMethod(getRegistrationInformationMethod())
              .addMethod(getVerificationResetPasswordTokenMethod())
              .addMethod(getGetEmailFromTokenMethod())
              .addMethod(getValidateTokenMethod())
              .addMethod(getGetAllUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
