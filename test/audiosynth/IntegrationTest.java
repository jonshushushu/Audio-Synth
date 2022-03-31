package audiosynth;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IntegrationTest {

    @Test
    void readSong() {
       Song tinySong = new SongReader().readSong(stringInputStream(tinySongCSV));
       assertArrayEquals(
           tinySongRendered,
           tinySong.renderAudio().getSamples(),
           0.002f);
    }

    private InputStream stringInputStream(String s) {
        return new ByteArrayInputStream(s.getBytes(StandardCharsets.US_ASCII));
    }

    private static final String tinySongCSV =
        "saw,    38, 0.00, 0.04\n" +
        "square, 54, 0.01, 0.04\n" +
        "tri,    57, 0.02, 0.04\n" +
        "sine,   61, 0.03, 0.04";

    private static final float[] tinySongRendered = new float[] {
        -0.258f, -0.257f, -0.256f, -0.255f, -0.254f, -0.254f, -0.253f, -0.252f, -0.251f, -0.250f, -0.250f, -0.249f, -0.248f, -0.247f, -0.247f, -0.246f,
        -0.245f, -0.244f, -0.243f, -0.243f, -0.242f, -0.241f, -0.240f, -0.239f, -0.239f, -0.238f, -0.237f, -0.236f, -0.236f, -0.235f, -0.234f, -0.233f,
        -0.232f, -0.232f, -0.231f, -0.230f, -0.229f, -0.228f, -0.228f, -0.227f, -0.226f, -0.225f, -0.224f, -0.224f, -0.223f, -0.222f, -0.221f, -0.221f,
        -0.220f, -0.219f, -0.218f, -0.217f, -0.217f, -0.216f, -0.215f, -0.214f, -0.213f, -0.213f, -0.212f, -0.211f, -0.210f, -0.210f, -0.209f, -0.208f,
        -0.207f, -0.206f, -0.206f, -0.205f, -0.204f, -0.203f, -0.202f, -0.202f, -0.201f, -0.200f, -0.199f, -0.198f, -0.198f, -0.197f, -0.196f, -0.195f,
        -0.195f, -0.194f, -0.193f, -0.192f, -0.191f, -0.191f, -0.190f, -0.189f, -0.188f, -0.187f, -0.187f, -0.186f, -0.185f, -0.184f, -0.184f, -0.183f,
        -0.182f, -0.181f, -0.180f, -0.180f, -0.179f, -0.178f, -0.177f, -0.176f, -0.176f, -0.175f, -0.174f, -0.173f, -0.172f, -0.172f, -0.171f, -0.170f,
        -0.169f, -0.169f, -0.168f, -0.167f, -0.166f, -0.165f, -0.165f, -0.164f, -0.163f, -0.162f, -0.161f, -0.161f, -0.160f, -0.159f, -0.158f, -0.158f,
        -0.157f, -0.156f, -0.155f, -0.154f, -0.154f, -0.153f, -0.152f, -0.151f, -0.150f, -0.150f, -0.149f, -0.148f, -0.147f, -0.146f, -0.146f, -0.145f,
        -0.144f, -0.143f, -0.143f, -0.142f, -0.141f, -0.140f, -0.139f, -0.139f, -0.138f, -0.137f, -0.136f, -0.135f, -0.135f, -0.134f, -0.133f, -0.132f,
        -0.132f, -0.131f, -0.130f, -0.129f, -0.128f, -0.128f, -0.127f, -0.126f, -0.125f, -0.124f, -0.124f, -0.123f, -0.122f, -0.121f, -0.120f, -0.120f,
        -0.119f, -0.118f, -0.117f, -0.117f, -0.116f, -0.115f, -0.114f, -0.113f, -0.113f, -0.112f, -0.111f, -0.110f, -0.109f, -0.109f, -0.108f, -0.107f,
        -0.106f, -0.106f, -0.105f, -0.104f, -0.103f, -0.102f, -0.102f, -0.101f, -0.100f, -0.099f, -0.098f, -0.098f, -0.097f, -0.096f, -0.095f, -0.094f,
        -0.094f, -0.093f, -0.092f, -0.091f, -0.091f, -0.090f, -0.089f, -0.088f, -0.087f, -0.087f, -0.086f, -0.085f, -0.084f, -0.083f, -0.083f, -0.082f,
        -0.081f, -0.080f, -0.080f, -0.079f, -0.078f, -0.077f, -0.076f, -0.076f, -0.075f, -0.074f, -0.073f, -0.072f, -0.072f, -0.071f, -0.070f, -0.069f,
        -0.068f, -0.068f, -0.067f, -0.066f, -0.065f, -0.065f, -0.064f, -0.063f, -0.062f, -0.061f, -0.061f, -0.060f, -0.059f, -0.058f, -0.057f, -0.057f,
        -0.056f, -0.055f, -0.054f, -0.054f, -0.053f, -0.052f, -0.051f, -0.050f, -0.050f, -0.049f, -0.048f, -0.047f, -0.046f, -0.046f, -0.045f, -0.044f,
        -0.043f, -0.042f, -0.042f, -0.041f, -0.040f, -0.039f, -0.039f, -0.038f, -0.037f, -0.036f, -0.035f, -0.035f, -0.034f, -0.033f, -0.032f, -0.031f,
        -0.031f, -0.030f, -0.029f, -0.028f, -0.028f, -0.027f, -0.026f, -0.025f, -0.024f, -0.024f, -0.023f, -0.022f, -0.021f, -0.020f, -0.020f, -0.019f,
        -0.018f, -0.017f, -0.016f, -0.016f, -0.015f, -0.014f, -0.013f, -0.013f, -0.012f, -0.011f, -0.010f, -0.009f, -0.009f, -0.008f, -0.007f, -0.006f,
        -0.005f, -0.005f, -0.004f, -0.003f, -0.002f, -0.001f, -0.001f, 0.000f, 0.001f, 0.002f, 0.002f, 0.003f, 0.004f, 0.005f, 0.006f, 0.006f,
        0.007f, 0.008f, 0.009f, 0.010f, 0.010f, 0.011f, 0.012f, 0.013f, 0.013f, 0.014f, 0.015f, 0.016f, 0.017f, 0.017f, 0.018f, 0.019f,
        0.020f, 0.021f, 0.021f, 0.022f, 0.023f, 0.024f, 0.025f, 0.025f, 0.026f, 0.027f, 0.028f, 0.028f, 0.029f, 0.030f, 0.031f, 0.032f,
        0.032f, 0.033f, 0.034f, 0.035f, 0.036f, 0.036f, 0.037f, 0.038f, 0.039f, 0.039f, 0.040f, 0.041f, 0.042f, 0.043f, 0.043f, 0.044f,
        0.045f, 0.046f, 0.047f, 0.047f, 0.048f, 0.049f, 0.050f, 0.051f, 0.051f, 0.052f, 0.053f, 0.054f, 0.054f, 0.055f, 0.056f, 0.057f,
        0.058f, 0.058f, 0.059f, 0.060f, 0.061f, 0.062f, 0.062f, 0.063f, 0.064f, 0.065f, 0.065f, 0.066f, 0.067f, 0.068f, 0.069f, 0.069f,
        0.070f, 0.071f, 0.072f, 0.073f, 0.073f, 0.074f, 0.075f, 0.076f, 0.077f, 0.077f, 0.078f, 0.079f, 0.080f, 0.080f, 0.081f, 0.082f,
        0.083f, 0.084f, 0.084f, 0.085f, 0.086f, 0.087f, 0.088f, 0.088f, 0.089f, 0.090f, 0.091f, 0.091f, 0.092f, 0.093f, 0.094f, 0.095f,
        0.095f, 0.096f, 0.097f, 0.098f, 0.099f, 0.099f, 0.100f, 0.101f, 0.102f, 0.103f, 0.103f, 0.104f, 0.105f, 0.106f, 0.106f, 0.107f,
        0.108f, 0.109f, 0.110f, 0.110f, 0.111f, 0.112f, 0.113f, 0.114f, 0.114f, 0.115f, 0.116f, 0.117f, 0.117f, 0.118f, 0.119f, 0.120f,
        -0.060f, -0.059f, -0.058f, -0.057f, -0.057f, -0.056f, -0.055f, -0.054f, -0.053f, -0.053f, -0.052f, -0.051f, -0.050f, -0.049f, -0.049f, -0.048f,
        -0.047f, -0.046f, -0.045f, -0.045f, -0.044f, -0.043f, -0.042f, -0.042f, -0.041f, -0.040f, -0.039f, -0.038f, -0.038f, -0.037f, -0.036f, -0.035f,
        -0.034f, -0.034f, -0.033f, -0.032f, -0.031f, -0.031f, -0.030f, -0.029f, -0.028f, -0.027f, -0.027f, -0.026f, -0.025f, -0.024f, -0.023f, -0.023f,
        -0.022f, -0.021f, -0.020f, -0.019f, -0.019f, -0.018f, -0.017f, -0.016f, -0.016f, -0.015f, -0.014f, -0.013f, -0.012f, -0.012f, -0.011f, -0.010f,
        -0.009f, -0.008f, -0.008f, -0.007f, -0.006f, -0.005f, -0.005f, -0.004f, -0.003f, -0.002f, -0.001f, -0.001f, 0.000f, 0.001f, 0.002f, 0.003f,
        0.003f, 0.004f, 0.005f, 0.006f, 0.007f, 0.007f, 0.008f, 0.009f, 0.010f, 0.010f, 0.011f, 0.012f, 0.013f, 0.014f, 0.014f, 0.015f,
        0.016f, 0.017f, 0.018f, 0.018f, 0.019f, 0.020f, 0.021f, 0.021f, 0.022f, 0.023f, 0.024f, 0.025f, 0.025f, 0.026f, 0.027f, 0.028f,
        0.029f, 0.029f, 0.030f, 0.031f, 0.032f, 0.033f, 0.033f, 0.034f, 0.035f, 0.036f, 0.036f, 0.037f, 0.038f, 0.039f, 0.040f, 0.040f,
        0.041f, 0.042f, 0.403f, 0.404f, 0.405f, 0.406f, 0.407f, 0.407f, 0.408f, 0.409f, 0.410f, 0.410f, 0.411f, 0.412f, 0.413f, 0.414f,
        0.414f, 0.415f, 0.416f, 0.417f, 0.418f, 0.418f, 0.419f, 0.420f, 0.421f, 0.421f, 0.422f, 0.423f, 0.424f, 0.425f, 0.425f, 0.426f,
        0.427f, 0.428f, 0.429f, 0.429f, 0.430f, 0.431f, 0.432f, 0.433f, 0.433f, 0.434f, 0.435f, 0.436f, 0.436f, 0.437f, -0.077f, -0.076f,
        -0.076f, -0.075f, -0.074f, -0.073f, -0.072f, -0.072f, -0.071f, -0.070f, -0.069f, -0.068f, -0.068f, -0.067f, -0.066f, -0.065f, -0.065f, -0.064f,
        -0.063f, -0.062f, -0.061f, -0.061f, -0.060f, -0.059f, -0.058f, -0.057f, -0.057f, -0.056f, -0.055f, -0.054f, -0.053f, -0.053f, -0.052f, -0.051f,
        -0.050f, -0.050f, -0.049f, -0.048f, -0.047f, -0.046f, -0.046f, -0.045f, -0.044f, -0.043f, -0.042f, -0.042f, -0.041f, -0.040f, -0.039f, -0.039f,
        -0.038f, -0.037f, -0.036f, -0.035f, -0.035f, -0.034f, -0.033f, -0.032f, -0.031f, -0.031f, -0.030f, -0.029f, -0.028f, -0.027f, -0.027f, -0.026f,
        -0.025f, -0.024f, -0.024f, -0.023f, -0.022f, -0.021f, -0.020f, -0.020f, -0.019f, -0.018f, -0.017f, -0.016f, -0.016f, -0.015f, -0.014f, -0.013f,
        -0.013f, -0.012f, -0.011f, -0.010f, -0.370f, -0.369f, -0.368f, -0.368f, -0.367f, -0.366f, -0.365f, -0.364f, -0.364f, -0.363f, -0.362f, -0.361f,
        -0.361f, -0.360f, -0.359f, -0.358f, -0.357f, -0.357f, -0.356f, -0.355f, -0.354f, -0.353f, -0.353f, -0.352f, -0.351f, -0.350f, -0.349f, -0.349f,
        -0.348f, -0.347f, -0.346f, -0.346f, -0.345f, -0.344f, -0.343f, -0.342f, -0.342f, -0.341f, -0.340f, -0.339f, -0.338f, -0.338f, -0.337f, -0.336f,
        -0.335f, -0.335f, -0.334f, -0.333f, -0.332f, -0.331f, -0.331f, -0.330f, -0.329f, -0.328f, -0.327f, -0.327f, -0.326f, -0.325f, -0.324f, -0.323f,
        -0.323f, -0.322f, -0.321f, -0.320f, -0.320f, -0.319f, -0.318f, -0.317f, -0.316f, -0.316f, -0.315f, -0.314f, -0.313f, -0.312f, -0.312f, -0.311f,
        -0.310f, -0.309f, -0.309f, -0.308f, -0.307f, -0.306f, -0.305f, -0.305f, -0.304f, -0.303f, -0.302f, -0.301f, -0.301f, -0.300f, -0.299f, -0.298f,
        -0.297f, -0.297f, -0.296f, -0.295f, -0.294f, -0.294f, -0.293f, -0.292f, -0.291f, -0.290f, -0.290f, -0.289f, -0.288f, -0.287f, -0.286f, -0.286f,
        -0.285f, -0.284f, -0.283f, -0.283f, -0.282f, -0.281f, -0.280f, -0.279f, -0.279f, -0.278f, -0.277f, -0.276f, -0.275f, -0.275f, -0.274f, -0.273f,
        -0.272f, -0.271f, -0.271f, -0.270f, -0.269f, -0.268f, 0.093f, 0.094f, 0.095f, 0.095f, 0.096f, 0.097f, 0.098f, 0.099f, 0.099f, 0.100f,
        0.101f, 0.102f, 0.103f, 0.103f, 0.104f, 0.105f, 0.106f, 0.106f, 0.107f, 0.108f, 0.109f, 0.110f, 0.110f, 0.111f, 0.112f, 0.113f,
        0.114f, 0.114f, 0.115f, 0.116f, 0.117f, 0.117f, 0.118f, 0.119f, 0.120f, 0.121f, 0.121f, 0.122f, 0.123f, 0.124f, 0.125f, 0.125f,
        0.126f, 0.127f, 0.128f, 0.129f, 0.129f, 0.130f, 0.131f, 0.132f, 0.132f, 0.133f, 0.134f, 0.135f, 0.136f, 0.136f, 0.137f, 0.138f,
        0.139f, 0.140f, 0.140f, 0.141f, 0.142f, 0.143f, 0.144f, 0.144f, 0.145f, 0.146f, 0.147f, 0.147f, 0.148f, 0.149f, 0.150f, 0.151f,
        0.151f, 0.152f, 0.153f, 0.154f, 0.155f, 0.155f, 0.156f, 0.157f, 0.158f, 0.158f, 0.159f, 0.160f, 0.161f, 0.162f, 0.162f, 0.163f,
        0.679f, 0.670f, 0.662f, 0.653f, 0.645f, 0.636f, 0.627f, 0.619f, 0.610f, 0.601f, 0.593f, 0.584f, 0.575f, 0.567f, 0.558f, 0.549f,
        0.541f, 0.532f, 0.523f, 0.515f, 0.506f, 0.497f, 0.489f, 0.480f, 0.471f, 0.463f, 0.454f, 0.445f, 0.437f, 0.428f, 0.419f, 0.411f,
        0.402f, 0.393f, 0.385f, 0.376f, 0.368f, 0.359f, 0.350f, -0.019f, -0.028f, -0.036f, -0.045f, -0.054f, -0.062f, -0.071f, -0.080f, -0.088f,
        -0.097f, -0.106f, -0.114f, -0.123f, -0.132f, -0.140f, -0.149f, -0.158f, -0.166f, -0.175f, -0.184f, -0.192f, -0.201f, -0.210f, -0.218f, -0.227f,
        -0.235f, -0.244f, -0.253f, -0.261f, -0.270f, -0.279f, -0.287f, -0.296f, -0.305f, -0.313f, -0.322f, -0.331f, -0.339f, -0.348f, -0.357f, -0.365f,
        -0.374f, -0.383f, -0.391f, -0.400f, -0.409f, -0.417f, -0.426f, -0.435f, -0.443f, -0.452f, -0.461f, -0.469f, -0.478f, -0.487f, -0.495f, -0.504f,
        -0.513f, -0.521f, -0.530f, -0.538f, -0.547f, -0.556f, -0.564f, -0.573f, -0.582f, -0.590f, -0.599f, -0.608f, -0.616f, -0.625f, -0.617f, -0.606f,
        -0.596f, -0.586f, -0.576f, -0.565f, -0.555f, -0.545f, -0.535f, -0.524f, -0.514f, -0.504f, -0.494f, -0.484f, -0.473f, -0.463f, -0.453f, -0.443f,
        -0.432f, -0.422f, -0.412f, -0.402f, -0.391f, -0.381f, -0.371f, -0.361f, -0.350f, -0.340f, -0.330f, -0.320f, -0.310f, -0.299f, -0.289f, -0.279f,
        -0.269f, -0.258f, -0.248f, -0.238f, -0.228f, -0.217f, -0.207f, -0.197f, -0.187f, -0.177f, -0.166f, -0.156f, -0.146f, -0.136f, -0.125f, -0.115f,
        -0.105f, -0.095f, -0.084f, -0.074f, -0.064f, -0.054f, -0.044f, -0.033f, -0.023f, 0.348f, 0.358f, 0.368f, 0.379f, 0.389f, 0.399f, 0.409f,
        0.419f, 0.430f, 0.440f, 0.450f, 0.460f, 0.471f, 0.481f, 0.491f, 0.501f, 0.512f, 0.522f, 0.532f, 0.542f, 0.552f, 0.563f, 0.573f,
        0.583f, 0.593f, 0.604f, 0.614f, 0.624f, 0.634f, 0.645f, 0.655f, 0.665f, 0.675f, 0.685f, 0.696f, 0.706f, 0.716f, 0.726f, 0.737f,
        0.747f, 0.757f, 0.767f, 0.778f, 0.788f, 0.798f, 0.808f, 0.819f, 0.829f, 0.839f, 0.849f, 0.844f, 0.835f, 0.827f, 0.818f, 0.809f,
        0.801f, 0.792f, 0.783f, 0.775f, 0.766f, 0.757f, 0.749f, 0.740f, 0.731f, 0.723f, 0.714f, 0.705f, 0.697f, 0.688f, 0.680f, 0.671f,
        0.662f, 0.654f, 0.645f, 0.636f, 0.628f, 0.619f, 0.610f, 0.602f, 0.593f, 0.584f, 0.576f, 0.567f, 0.558f, 0.550f, 0.541f, 0.532f,
        0.524f, 0.515f, 0.506f, 0.498f, 0.489f, 0.480f, 0.472f, 0.463f, 0.454f, 0.446f, 0.437f, 0.428f, 0.420f, 0.411f, 0.402f, 0.394f,
        0.385f, 0.377f, 0.368f, 0.359f, 0.351f, 0.342f, 0.333f, 0.325f, 0.316f, 0.307f, 0.299f, 0.290f, 0.281f, 0.273f, 0.264f, 0.255f,
        0.247f, 0.238f, 0.229f, 0.221f, 0.212f, 0.203f, 0.195f, 0.186f, 0.177f, 0.169f, 0.160f, -0.209f, -0.218f, -0.226f, -0.235f, -0.244f,
        -0.252f, -0.261f, -0.270f, -0.278f, -0.287f, -0.296f, -0.304f, -0.313f, -0.322f, -0.330f, -0.339f, -0.348f, -0.356f, -0.365f, -0.374f, -0.382f,
        -0.391f, -0.400f, -0.408f, -0.417f, -0.426f, -0.434f, -0.443f, -0.452f, -0.446f, -0.436f, -0.426f, -0.416f, -0.406f, -0.395f, -0.385f, -0.375f,
        -0.365f, -0.354f, -0.344f, -0.334f, -0.324f, -0.313f, -0.303f, -0.293f, -0.283f, -0.273f, -0.262f, -0.252f, -0.757f, -0.747f, -0.737f, -0.726f,
        -0.716f, -0.706f, -0.696f, -0.685f, -0.675f, -0.665f, -0.655f, -0.644f, -0.634f, -0.624f, -0.614f, -0.603f, -0.593f, -0.583f, -0.573f, -0.563f,
        -0.552f, -0.542f, -0.532f, -0.522f, -0.511f, -0.501f, -0.491f, -0.481f, -0.470f, -0.460f, -0.450f, -0.440f, -0.430f, -0.419f, -0.409f, -0.399f,
        -0.389f, -0.378f, -0.368f, -0.358f, -0.348f, -0.337f, -0.327f, -0.317f, -0.307f, -0.297f, -0.286f, -0.276f, -0.266f, -0.256f, -0.245f, -0.235f,
        -0.225f, -0.215f, -0.204f, -0.194f, -0.184f, -0.174f, -0.163f, -0.153f, -0.143f, -0.133f, -0.123f, -0.112f, -0.102f, -0.092f, -0.082f, -0.071f,
        -0.061f, -0.051f, -0.041f, -0.030f, -0.020f, -0.010f, 0.000f, 0.010f, 0.021f, 0.031f, 0.041f, 0.051f, 0.062f, 0.432f, 0.443f, 0.453f,
        0.463f, 0.473f, 0.484f, 0.494f, 0.504f, 0.502f, 0.494f, 0.485f, 0.476f, 0.468f, 0.459f, 0.450f, 0.442f, 0.433f, 0.424f, 0.416f,
        0.407f, 0.398f, 0.390f, 0.381f, 0.372f, 0.364f, 0.355f, 0.346f, 0.338f, 0.329f, 0.321f, 0.312f, 0.303f, 0.295f, 0.286f, 0.277f,
        0.269f, 0.260f, 0.251f, 0.243f, 0.234f, 0.225f, 0.217f, 0.208f, 0.199f, 0.191f, 0.182f, 0.173f, 0.165f, 0.156f, 0.147f, 0.139f,
        0.130f, 0.140f, 0.150f, 0.160f, 0.170f, 0.180f, 0.189f, 0.199f, 0.208f, 0.217f, 0.226f, 0.235f, 0.243f, 0.252f, 0.259f, 0.267f,
        0.274f, 0.281f, 0.287f, 0.293f, 0.299f, 0.304f, 0.309f, 0.313f, 0.316f, 0.319f, 0.322f, 0.324f, 0.326f, 0.326f, 0.327f, 0.326f,
        0.326f, 0.324f, 0.322f, 0.319f, 0.316f, 0.312f, 0.307f, 0.301f, 0.295f, 0.289f, 0.281f, 0.273f, 0.264f, 0.255f, 0.245f, 0.234f,
        0.222f, 0.210f, 0.197f, 0.184f, 0.170f, 0.155f, 0.139f, 0.123f, 0.107f, 0.089f, 0.072f, 0.053f, 0.034f, 0.014f, -0.006f, -0.026f,
        -0.047f, -0.069f, -0.081f, -0.085f, -0.089f, -0.093f, -0.098f, -0.104f, -0.109f, -0.116f, -0.122f, -0.129f, -0.136f, -0.143f, -0.511f, -0.519f,
        -0.526f, -0.534f, -0.543f, -0.551f, -0.559f, -0.568f, -0.576f, -0.584f, -0.593f, -0.601f, -0.610f, -0.618f, -0.626f, -0.634f, -0.642f, -0.650f,
        -0.657f, -0.664f, -0.671f, -0.678f, -0.685f, -0.691f, -0.697f, -0.702f, -0.707f, -0.712f, -0.716f, -0.720f, -0.723f, -0.726f, -0.728f, -0.730f,
        -0.731f, -0.732f, -0.732f, -0.732f, -0.731f, -0.730f, -0.728f, -0.725f, -0.721f, -0.717f, -0.713f, -0.708f, -0.702f, -0.695f, -0.688f, -0.680f,
        -0.671f, -0.662f, -0.652f, -0.641f, -0.630f, -0.618f, -0.605f, -0.592f, -0.578f, -0.563f, -0.548f, -0.532f, -0.515f, -0.498f, -0.480f, -0.462f,
        -0.442f, -0.423f, -0.402f, -0.382f, -0.360f, -0.338f, -0.316f, -0.293f, -0.270f, -0.246f, -0.221f, -0.196f, -0.171f, -0.146f, -0.120f, -0.093f,
        -0.067f, -0.040f, -0.012f, 0.015f, 0.043f, 0.071f, 0.099f, 0.128f, 0.156f, 0.185f, 0.213f, 0.242f, 0.271f, 0.300f, 0.329f, 0.349f,
        0.359f, 0.369f, 0.379f, 0.389f, 0.398f, 0.408f, 0.417f, 0.426f, 0.435f, 0.443f, 0.451f, 0.459f, 0.467f, 0.474f, 0.481f, 0.487f,
        0.493f, 0.499f, 0.504f, 0.509f, 0.513f, 0.517f, 0.520f, 0.523f, 0.525f, 0.526f, 0.527f, 0.528f, 0.528f, 0.527f, 0.525f, 0.523f,
        0.881f, 0.878f, 0.874f, 0.869f, 0.864f, 0.858f, 0.851f, 0.844f, 0.836f, 0.827f, 0.818f, 0.808f, 0.797f, 0.786f, 0.774f, 0.761f,
        0.748f, 0.734f, 0.719f, 0.704f, 0.688f, 0.671f, 0.654f, 0.636f, 0.618f, 0.599f, 0.579f, 0.559f, 0.539f, 0.518f, 0.496f, 0.474f,
        0.452f, 0.429f, 0.405f, 0.381f, 0.357f, 0.333f, 0.308f, 0.283f, 0.257f, 0.231f, 0.205f, 0.179f, 0.152f, 0.126f, 0.099f, 0.072f,
        0.045f, 0.017f, -0.010f, -0.037f, -0.065f, -0.092f, -0.119f, -0.146f, -0.174f, -0.201f, -0.228f, -0.254f, -0.281f, -0.307f, -0.334f, -0.360f,
        -0.385f, -0.411f, -0.436f, -0.460f, -0.485f, -0.509f, -0.532f, -0.556f, -0.578f, -0.601f, -0.623f, -0.644f, -0.658f, -0.659f, -0.660f, -0.660f,
        -0.660f, -0.659f, -0.658f, -0.656f, -0.653f, -0.650f, -0.646f, -0.642f, -0.637f, -0.631f, -0.624f, -0.617f, -0.609f, -0.601f, -0.592f, -0.582f,
        -0.571f, -0.560f, -0.548f, -0.535f, -0.522f, -0.508f, -0.494f, -0.479f, -0.463f, -0.446f, -0.429f, -0.411f, -0.393f, -0.374f, -0.354f, -0.334f,
        -0.313f, -0.292f, -0.270f, -0.248f, -0.225f, -0.202f, -0.178f, -0.153f, -0.129f, -0.104f, -0.078f, -0.052f, -0.026f, 0.001f, 0.028f, 0.055f,
        0.082f, 0.110f, -0.223f, -0.194f, -0.166f, -0.137f, -0.109f, -0.080f, -0.051f, -0.022f, 0.006f, 0.035f, 0.064f, 0.093f, 0.122f, 0.151f,
        0.179f, 0.208f, 0.236f, 0.264f, 0.292f, 0.320f, 0.347f, 0.374f, 0.401f, 0.428f, 0.454f, 0.480f, 0.505f, 0.530f, 0.555f, 0.579f,
        0.602f, 0.626f, 0.648f, 0.671f, 0.692f, 0.713f, 0.734f, 0.754f, 0.773f, 0.792f, 0.810f, 0.828f, 0.845f, 0.861f, 0.877f, 0.892f,
        0.906f, 0.920f, 0.933f, 0.945f, 0.957f, 0.968f, 0.978f, 0.988f, 0.997f, 1.000f, 0.989f, 0.977f, 0.964f, 0.951f, 0.937f, 0.922f,
        0.907f, 0.891f, 0.875f, 0.858f, 0.840f, 0.822f, 0.803f, 0.784f, 0.764f, 0.743f, 0.722f, 0.701f, 0.679f, 0.656f, 0.634f, 0.610f,
        0.586f, 0.562f, 0.538f, 0.513f, 0.488f, 0.462f, 0.437f, 0.411f, 0.384f, 0.358f, 0.331f, 0.304f, 0.277f, 0.250f, 0.223f, 0.196f,
        0.168f, 0.141f, 0.114f, 0.086f, 0.059f, 0.032f, 0.005f, -0.022f, -0.049f, -0.076f, -0.102f, -0.128f, -0.154f, -0.180f, -0.205f, -0.231f,
        -0.255f, -0.280f, -0.304f, -0.328f, -0.351f, -0.374f, -0.396f, -0.418f, -0.439f, -0.460f, -0.481f, -0.501f, -0.520f, -0.539f, -0.557f, -0.574f,
        -0.591f, -0.608f, -0.623f, -0.639f, -0.292f, -0.306f, -0.319f, -0.332f, -0.344f, -0.355f, -0.365f, -0.375f, -0.384f, -0.393f, -0.401f, -0.408f,
        -0.639f, -0.646f, -0.652f, -0.657f, -0.661f, -0.665f, -0.669f, -0.671f, -0.673f, -0.675f, -0.675f, -0.676f, -0.675f, -0.674f, -0.673f, -0.671f,
        -0.668f, -0.665f, -0.661f, -0.657f, -0.653f, -0.648f, -0.639f, -0.614f, -0.589f, -0.564f, -0.538f, -0.512f, -0.485f, -0.459f, -0.432f, -0.405f,
        -0.377f, -0.350f, -0.322f, -0.294f, -0.266f, -0.238f, -0.210f, -0.182f, -0.154f, -0.126f, -0.098f, -0.070f, -0.042f, -0.014f, 0.014f, 0.041f,
        0.069f, 0.096f, 0.123f, 0.149f, 0.176f, 0.202f, 0.228f, 0.253f, 0.278f, 0.303f, 0.327f, 0.351f, 0.374f, 0.397f, 0.420f, 0.442f,
        0.463f, 0.484f, 0.505f, 0.525f, 0.544f, 0.563f, 0.581f, 0.598f, 0.615f, 0.631f, 0.647f, 0.662f, 0.676f, 0.690f, 0.703f, 0.715f,
        0.727f, 0.738f, 0.748f, 0.758f, 0.767f, 0.775f, 0.783f, 0.790f, 0.796f, 0.802f, 0.807f, 0.811f, 0.815f, 0.818f, 0.820f, 0.822f,
        0.823f, 0.824f, 0.823f, 0.823f, 0.822f, 0.820f, 0.818f, 0.815f, 0.812f, 0.808f, 0.803f, 0.799f, 0.794f, 0.788f, 0.782f, 0.776f,
        0.769f, 0.762f, 0.755f, 0.747f, 0.739f, 0.370f, 0.362f, 0.354f, 0.345f, 0.336f, 0.327f, 0.318f, 0.309f, 0.300f, 0.290f, 0.281f,
        0.272f, 0.263f, 0.254f, 0.243f, 0.215f, 0.187f, 0.160f, 0.133f, 0.106f, 0.079f, 0.052f, 0.026f, 0.000f, -0.026f, -0.051f, -0.076f,
        -0.100f, -0.124f, -0.148f, -0.171f, -0.194f, -0.216f, -0.238f, -0.260f, -0.280f, -0.300f, -0.320f, -0.339f, -0.358f, -0.376f, -0.393f, -0.409f,
        -0.425f, -0.441f, -0.456f, -0.470f, -0.483f, -0.496f, -0.508f, -0.519f, -0.530f, -0.540f, -0.549f, -0.558f, -0.566f, -0.573f, -0.580f, -0.586f,
        -0.591f, -0.596f, -0.600f, -0.604f, -0.606f, -0.608f, -0.610f, -0.611f, -0.611f, -0.611f, -0.610f, -0.608f, -0.606f, -0.604f, -0.601f, -0.597f,
        -0.593f, -0.589f, -0.584f, -0.579f, -0.573f, -0.567f, -0.560f, -0.554f, -0.546f, -0.539f, -0.531f, -0.523f, -0.515f, -0.507f, -0.498f, -0.489f,
        -0.480f, -0.471f, -0.462f, -0.453f, -0.444f, -0.435f, -0.425f, -0.416f, -0.407f, -0.398f, -0.389f, -0.380f, -0.371f, -0.363f, -0.355f, -0.347f,
        -0.339f, -0.331f, -0.324f, -0.317f, -0.310f, -0.304f, -0.298f, -0.293f, -0.288f, -0.283f, -0.279f, -0.275f, -0.272f, -0.269f, -0.267f, -0.266f,
        -0.264f, -0.245f, -0.226f, -0.208f, -0.190f, -0.173f, -0.157f, 0.219f, 0.234f, 0.249f, 0.263f, 0.276f, 0.288f, 0.300f, 0.311f, 0.322f,
        0.331f, 0.341f, 0.349f, 0.357f, 0.364f, 0.370f, 0.376f, 0.381f, 0.385f, 0.389f, 0.392f, 0.395f, 0.397f, 0.398f, 0.398f, 0.398f,
        0.398f, 0.397f, 0.395f, 0.393f, 0.390f, 0.387f, 0.383f, 0.379f, 0.374f, 0.369f, 0.364f, 0.358f, 0.352f, 0.345f, 0.338f, 0.331f,
        0.323f, 0.315f, 0.307f, 0.299f, 0.291f, 0.282f, 0.273f, 0.264f, 0.255f, 0.246f, 0.237f, 0.227f, 0.218f, 0.209f, 0.200f, 0.191f,
        0.182f, 0.173f, 0.164f, 0.155f, 0.147f, 0.139f, 0.131f, 0.123f, 0.116f, 0.108f, 0.102f, 0.095f, 0.089f, 0.083f, 0.078f, 0.073f,
        0.069f, 0.065f, 0.061f, 0.058f, 0.056f, 0.054f, 0.052f, 0.052f, 0.051f, 0.052f, 0.053f, 0.054f, 0.056f, 0.059f, 0.062f, 0.066f,
        0.071f, 0.077f, 0.083f, 0.089f, 0.097f, 0.105f, 0.113f, 0.123f, 0.133f, 0.144f, 0.155f, 0.167f, 0.180f, 0.193f, 0.190f, 0.186f,
        0.183f, 0.180f, 0.178f, 0.176f, 0.175f, 0.175f, 0.175f, 0.176f, 0.177f, 0.179f, 0.181f, 0.184f, 0.188f, 0.192f, 0.196f, 0.201f,
        0.206f, 0.212f, 0.218f, 0.224f, 0.231f, 0.238f, 0.245f, 0.253f, 0.261f, -0.091f, -0.083f, -0.074f, -0.066f, -0.057f, -0.048f, -0.039f,
        -0.029f, -0.020f, -0.011f, -0.002f, 0.007f, 0.017f, 0.026f, 0.035f, 0.044f, 0.052f, 0.061f, 0.069f, 0.077f, 0.085f, 0.093f, 0.100f,
        0.107f, 0.114f, 0.120f, 0.126f, 0.131f, 0.137f, 0.141f, 0.146f, 0.149f, 0.153f, 0.155f, 0.158f, 0.159f, 0.160f, 0.161f, 0.161f,
        0.161f, 0.159f, 0.158f, 0.155f, 0.152f, 0.149f, 0.144f, 0.139f, 0.134f, 0.127f, 0.120f, 0.113f, 0.104f, 0.095f, 0.086f, 0.075f,
        0.064f, 0.053f, 0.040f, 0.027f, 0.013f, -0.001f, -0.016f, -0.032f, -0.048f, -0.065f, -0.082f, -0.101f, -0.119f, -0.139f, -0.159f, -0.179f,
        -0.200f, -0.222f, -0.244f, -0.266f, -0.289f, -0.313f, -0.336f, -0.361f, -0.385f, -0.411f, -0.436f, -0.446f, -0.454f, -0.461f, -0.469f, -0.477f,
        -0.485f, -0.494f, -0.502f, -0.511f, -0.520f, -0.529f, -0.538f, -0.547f, -0.557f, -0.566f, -0.575f, -0.584f, -0.594f, -0.603f, -0.612f, -0.620f,
        -0.449f, -0.457f, -0.465f, -0.473f, -0.481f, -0.489f, -0.496f, -0.503f, -0.509f, -0.515f, -0.521f, -0.526f, -0.531f, -0.536f, -0.540f, -0.544f,
        -0.547f, -0.549f, -0.551f, -0.553f, -0.554f, -0.554f, -0.554f, -0.553f, -0.552f, -0.550f, -0.547f, -0.544f, -0.540f, -0.535f, -0.530f, -0.524f,
        -0.517f, -0.510f, -0.502f, -0.494f, -0.484f, -0.474f, -0.464f, -0.452f, -0.440f, -0.428f, -0.414f, -0.400f, -0.386f, -0.370f, -0.354f, -0.338f,
        -0.321f, -0.303f, -0.285f, -0.266f, -0.246f, -0.226f, -0.205f, -0.184f, -0.162f, -0.140f, -0.117f, -0.094f, -0.070f, -0.046f, -0.022f, 0.003f,
        0.028f, 0.054f, 0.080f, 0.106f, 0.132f, 0.159f, 0.186f, 0.214f, 0.241f, 0.269f, 0.296f, 0.324f, 0.352f, 0.380f, 0.408f, 0.437f,
        0.465f, 0.493f, 0.521f, 0.549f, 0.577f, 0.604f, 0.632f, 0.660f, 0.673f, 0.681f, 0.689f, 0.697f, 0.704f, 0.711f, 0.718f, 0.724f,
        0.730f, 0.736f, 0.741f, 0.746f, 0.750f, 0.754f, 0.757f, 0.760f, 0.763f, 0.764f, 0.766f, 0.766f, 0.767f, 0.766f, 0.765f, 0.763f,
        0.761f, 0.758f, 0.755f, 0.750f, 0.746f, 0.740f, 0.734f, 0.727f, 0.719f, 0.711f, 0.702f, 0.693f, 0.682f, 0.672f, 0.660f, 0.648f,
        0.635f, 0.621f, 0.607f, 0.592f, 0.576f, 0.560f, 0.543f, 0.526f, 0.508f, 0.489f, 0.470f, 0.450f, 0.430f, 0.409f, 0.388f, 0.366f,
        0.343f, 0.320f, 0.297f, 0.273f, 0.249f, 0.224f, 0.199f, 0.174f, 0.148f, 0.122f, 0.096f, 0.069f, 0.042f, 0.015f, -0.012f, -0.040f,
        -0.068f, -0.095f, -0.123f, -0.151f, -0.179f, -0.208f, -0.236f, -0.264f, -0.292f, -0.320f, -0.348f, -0.376f, -0.403f, -0.431f, -0.458f, -0.486f,
        -0.512f, -0.539f, -0.566f, -0.592f, -0.618f, -0.643f, -0.668f, -0.693f, -0.717f, -0.741f, -0.765f, -0.788f, -0.810f, -0.832f, -0.854f, -0.875f,
        -0.895f, -0.915f, -0.934f, -0.953f, -0.971f, -0.977f, -0.975f, -0.973f, -0.969f, -0.965f, -0.961f, -0.956f, -0.950f, -0.944f, -0.936f, -0.929f,
        -0.920f, -0.911f, -0.901f, -0.891f, -0.879f, -0.868f, -0.855f, -0.842f, -0.828f, -0.813f, -0.798f, -0.782f, -0.766f, -0.749f, -0.731f, -0.713f,
        -0.694f, -0.674f, -0.654f, -0.634f, -0.613f, -0.591f, -0.569f, -0.546f, -0.523f, -0.500f, -0.476f, -0.451f, -0.426f, -0.401f, -0.376f, -0.350f,
        -0.324f, -0.297f, -0.270f, -0.243f, -0.216f, -0.189f, -0.161f, -0.133f, -0.106f, -0.078f, -0.050f, -0.022f, 0.007f, 0.035f, 0.063f, 0.091f,
        0.119f, 0.147f, 0.175f, 0.202f, 0.230f, 0.257f, 0.284f, 0.311f, 0.338f, 0.364f, 0.390f, 0.416f, 0.441f, 0.466f, 0.490f, 0.515f,
        0.538f, 0.562f, 0.584f, 0.607f, 0.629f, 0.650f, 0.671f, 0.691f, 0.711f, 0.730f, 0.748f, 0.766f, 0.784f, 0.800f, 0.816f, 0.832f,
        0.847f, 0.861f, 0.874f, 0.887f, 0.899f, 0.911f, 0.921f, 0.932f, 0.941f, 0.950f, 0.958f, 0.965f, 0.972f, 0.978f, 0.983f, 0.988f,
        0.992f, 0.996f, 0.988f, 0.971f, 0.954f, 0.936f, 0.918f, 0.899f, 0.879f, 0.859f, 0.838f, 0.816f, 0.795f, 0.772f, 0.749f, 0.726f,
        0.702f, 0.678f, 0.654f, 0.629f, 0.603f, 0.578f, 0.552f, 0.525f, 0.499f, 0.472f, 0.445f, 0.417f, 0.390f, 0.362f, 0.335f, 0.307f,
        0.279f, 0.251f, 0.222f, 0.194f, 0.166f, 0.138f, 0.110f, 0.082f, 0.054f, 0.026f, -0.001f, -0.029f, -0.056f, -0.083f, -0.109f, -0.136f,
        -0.162f, -0.188f, -0.214f, -0.239f, -0.264f, -0.288f, -0.312f, -0.335f, -0.359f, -0.381f, -0.403f, -0.425f, -0.446f, -0.467f, -0.487f, -0.506f,
        -0.525f, -0.543f, -0.561f, -0.578f, -0.594f, -0.610f, -0.625f, -0.640f, -0.654f, -0.667f, -0.680f, -0.691f, -0.703f, -0.713f, -0.723f, -0.732f,
        -0.741f, -0.748f, -0.756f, -0.762f, -0.768f, -0.773f, -0.777f, -0.781f, -0.784f, -0.787f, -0.789f, -0.790f, -0.791f, -0.791f, -0.790f, -0.789f,
        -0.788f, -0.786f, -0.783f, -0.780f, -0.776f, -0.772f, -0.767f, -0.762f, -0.757f, -0.751f, -0.745f, -0.738f, -0.731f, -0.724f, -0.717f, -0.700f,
        -0.673f, -0.646f, -0.619f, -0.591f, -0.563f, -0.536f, -0.508f, -0.480f, -0.451f, -0.423f, -0.395f, -0.367f, -0.339f, -0.311f, -0.283f, -0.255f,
        -0.228f, -0.200f, -0.173f, -0.146f, -0.119f, -0.092f, -0.066f, -0.040f, -0.014f, 0.011f, 0.036f, 0.061f, 0.085f, 0.109f, 0.133f, 0.155f,
        0.178f, 0.200f, 0.221f, 0.242f, 0.262f, 0.282f, 0.301f, 0.320f, 0.338f, 0.356f, 0.372f, 0.389f, 0.404f, 0.419f, 0.433f, 0.447f,
        0.460f, 0.472f, 0.484f, 0.494f, 0.505f, 0.514f, 0.523f, 0.531f, 0.539f, 0.546f, 0.552f, 0.557f, 0.562f, 0.566f, 0.570f, 0.573f,
        0.472f, 0.464f, 0.456f, 0.447f, 0.437f, 0.427f, 0.417f, 0.405f, 0.393f, 0.381f, 0.368f, 0.355f, 0.341f, 0.327f, 0.312f, 0.297f,
        0.282f, 0.266f, 0.250f, 0.233f, 0.216f, 0.199f, 0.182f, 0.164f, 0.147f, 0.129f, 0.110f, 0.092f, 0.074f, 0.055f, 0.036f, 0.018f,
        -0.001f, -0.020f, -0.038f, -0.057f, -0.075f, -0.094f, -0.112f, -0.130f, -0.148f, -0.166f, -0.184f, -0.201f, -0.218f, -0.235f, -0.251f, -0.267f,
        -0.283f, -0.299f, -0.314f, -0.328f, -0.343f, -0.356f, -0.370f, -0.382f, -0.395f, -0.406f, -0.418f, -0.428f, -0.438f, -0.448f, -0.457f, -0.465f,
        -0.473f, -0.480f, -0.486f, -0.492f, -0.497f, -0.502f, -0.506f, -0.509f, -0.512f, -0.513f, -0.515f, -0.515f, -0.515f, -0.514f, -0.513f, -0.510f,
        -0.508f, -0.504f, -0.500f, -0.495f, -0.489f, -0.483f, -0.476f, -0.469f, -0.461f, -0.452f, -0.443f, -0.433f, -0.423f, -0.412f, -0.400f, -0.388f,
        -0.376f, -0.363f, -0.349f, -0.335f, -0.321f, -0.306f, -0.291f, -0.275f, -0.259f, -0.243f, -0.226f, -0.209f, -0.192f, -0.175f, -0.157f, -0.139f,
        -0.121f, -0.103f, -0.084f, -0.066f, -0.047f, -0.029f, -0.010f, 0.009f, 0.027f, 0.046f, 0.065f, 0.083f, 0.101f, 0.120f, 0.138f, 0.156f,
        0.173f, 0.191f, 0.208f, 0.225f, 0.242f, 0.258f, 0.274f, 0.290f, 0.305f, 0.320f, 0.334f, 0.348f, 0.362f, 0.375f, 0.387f, 0.400f,
        0.411f, 0.422f, 0.432f, 0.442f, 0.452f, 0.460f, 0.468f, 0.476f, 0.483f, 0.489f, 0.495f, 0.499f, 0.504f, 0.507f, 0.510f, 0.512f,
        0.514f, 0.515f, 0.515f, 0.515f, 0.514f, 0.512f, 0.509f, 0.506f, 0.502f, 0.498f, 0.493f, 0.487f, 0.480f, 0.473f, 0.466f, 0.457f,
        0.449f, 0.439f, 0.429f, 0.418f, 0.407f, 0.396f, 0.383f, 0.371f, 0.357f, 0.344f, 0.329f, 0.315f, 0.300f, 0.284f, 0.269f, 0.253f,
        0.236f, 0.219f, 0.202f, 0.185f, 0.167f, 0.150f, 0.132f, 0.114f, 0.095f, 0.077f, 0.058f, 0.040f, 0.021f, 0.002f, -0.016f, -0.035f,
        -0.054f, -0.072f, -0.091f, -0.109f, -0.127f, -0.145f, -0.163f, -0.181f, -0.198f, -0.215f, -0.232f, -0.249f, -0.265f, -0.281f, -0.296f, -0.311f,
        -0.326f, -0.340f, -0.354f, -0.367f, -0.380f, -0.393f, -0.404f, -0.416f, -0.426f, -0.437f, -0.446f, -0.455f, -0.464f, -0.472f, -0.479f, -0.485f,
        -0.491f, -0.497f, -0.501f, -0.505f, -0.509f, -0.511f, -0.513f, -0.514f, -0.515f, -0.515f, -0.514f, -0.513f, -0.511f, -0.508f, -0.505f, -0.501f,
        -0.496f, -0.490f, -0.484f, -0.478f, -0.470f, -0.462f, -0.454f, -0.445f, -0.435f, -0.425f, -0.414f, -0.402f, -0.391f, -0.378f, -0.365f, -0.352f,
        -0.338f, -0.323f, -0.309f, -0.294f, -0.278f, -0.262f, -0.246f, -0.229f, -0.212f, -0.195f, -0.178f, -0.160f, -0.142f, -0.124f, -0.106f, -0.088f,
        -0.069f, -0.051f, -0.032f, -0.013f, 0.005f, 0.024f, 0.043f, 0.061f, 0.080f, 0.098f, 0.117f, 0.135f, 0.153f, 0.170f, 0.188f, 0.205f,
        0.222f, 0.239f, 0.255f, 0.271f, 0.287f, 0.302f, 0.317f, 0.332f, 0.346f, 0.360f, 0.373f, 0.385f, 0.397f, 0.409f, 0.420f, 0.431f,
        0.441f, 0.450f, 0.459f, 0.467f, 0.475f, 0.482f, 0.488f, 0.494f, 0.499f, 0.503f, 0.507f, 0.510f, 0.512f, 0.514f, 0.515f, 0.515f,
        0.515f, 0.514f, 0.512f, 0.510f, 0.507f, 0.503f, 0.499f, 0.494f, 0.488f, 0.482f, 0.475f, 0.467f, 0.459f, 0.450f, 0.441f, 0.431f,
        0.420f, 0.409f, 0.398f, 0.385f, 0.373f, 0.360f, 0.346f, 0.332f, 0.317f, 0.302f, 0.287f, 0.271f, 0.255f, 0.239f, 0.222f, 0.205f,
        0.188f, 0.170f, 0.153f, 0.135f, 0.117f, 0.098f, 0.080f, 0.061f, 0.043f, 0.024f, 0.006f, -0.013f, -0.032f, -0.050f, -0.069f, -0.088f,
        -0.106f, -0.124f, -0.142f, -0.160f, -0.178f, -0.195f, -0.212f, -0.229f, -0.246f, -0.262f, -0.278f, -0.293f, -0.309f, -0.323f, -0.338f, -0.352f,
        -0.365f, -0.378f, -0.390f, -0.402f, -0.414f, -0.425f, -0.435f, -0.445f, -0.454f, -0.462f, -0.470f, -0.478f, -0.484f, -0.490f, -0.496f, -0.501f,
        -0.505f, -0.508f, -0.511f, -0.513f, -0.514f, -0.515f, -0.515f, -0.514f, -0.513f, -0.511f, -0.509f, -0.505f, -0.501f, -0.497f, -0.491f, -0.485f,
        -0.479f, -0.472f, -0.464f, -0.455f, -0.446f, -0.437f, -0.426f, -0.416f, -0.404f, -0.393f, -0.380f, -0.367f, -0.354f, -0.340f, -0.326f, -0.311f,
        -0.296f, -0.281f, -0.265f, -0.249f, -0.232f, -0.215f, -0.198f, -0.181f, -0.163f, -0.145f, -0.127f, -0.109f, -0.091f, -0.072f, -0.054f, -0.035f,
        -0.016f, 0.002f, 0.021f, 0.040f, 0.058f, 0.077f, 0.095f, 0.113f, 0.132f, 0.150f, 0.167f, 0.185f, 0.202f, 0.219f, 0.236f, 0.253f
    };
}
