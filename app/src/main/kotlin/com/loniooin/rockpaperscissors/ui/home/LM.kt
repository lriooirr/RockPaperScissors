import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.loniooin.rockpaperscissors.ui.theme.williamsblue

@Preview
@Composable
fun KnowMoreView(onContinueClicked: () -> Unit) {
    Column {
        Text(text = LM.INFOMATION, color = Color.Black)
        Spacer(modifier = Modifier.height(24.dp))
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = onContinueClicked
        ) {
            Text(
                "返回主页", color = williamsblue,
                style = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.ExtraBold)
            )
        }
    }
}

object LM {
    const val INFOMATION = """
    声明
            首先的，我们郑重的对您声明，决断帮手RS及其制作团队对于由决断帮手RS帮您做出的决断不负任何法律责任，如果您是成年人您应有自我判断能力，并全权对自己做出的行为负责，如果您是未成年人应当先行与父母商讨后再做出合理的决断，由此软件引发的全部事件解释权均归决断帮手RS的制作团队所有！
    编写
            自RS系列软件投用以来，便以前沿的科技帮助课堂保持气氛的活跃，我们认为生活中亦需如此，这便诞生了承袭自RS系列的决断帮手RS，自RS1起不变探索精神，并使用与RS2，RS3相同的kotlin编写，但换用了最前沿的Compose安卓UI编写办法，我们秉持用科技幸福生活的理念，克服重重苦难制作出决断帮手RS！
    设计
            决断帮手RS拒绝直角边框，我们全部采用了更加美观的圆角设计，不仅如此，对于Button和TopAppBar以及其他特殊部分，我们采用了两种来自Williams Racing F1车队的[威廉姆斯电汽蓝]颜色。
"""

}