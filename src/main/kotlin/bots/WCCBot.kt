package bots

import com.vdurmont.emoji.EmojiParser
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.methods.send.SendDocument
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.methods.send.SendVideo

import org.telegram.telegrambots.meta.api.objects.InputFile
import org.telegram.telegrambots.meta.api.objects.Update
import org.telegram.telegrambots.meta.exceptions.TelegramApiException

class WCCBot : TelegramLongPollingBot() {

    /*val welcome = EmojiParser.parseToUnicode("""
        *Olaaaaaá :blush:, tudo bem\?*
        Bem\-vinde à terra da She\-Ra\!
        Escolha:
        \/start \- começar o projeto
        \/info \- para saber mais sobre o projeto
    """).trimIndent()*/

    override fun getBotUsername(): String {
        //return bot username
        // If bot username is @HelloKotlinBot, it must return
        return "She-Ra_Bot"
    }

    override fun getBotToken(): String {
        // Return bot token from BotFather
        return "2100719269:AAGYvSVoSe2X6ZvVohPx8AdAV6FFcUyxrjY"
    }

    override fun onUpdateReceived(update: Update?) {
        // We check if the update has a message and the message has text
        val nameSender = update?.message?.from?.firstName
        val chatId = update?.message?.chatId.toString()
        val messageCommand = update?.message?.text
        val sinopse = update?.message?.text

        try {
            if (messageCommand == "/start") {
                val sendDocument = SendDocument().apply {
                    this.chatId = chatId
                    this.caption = getMessage(messageCommand, nameSender)
                    this.document = InputFile().setMedia("https://media.giphy.com/media/10SWbW9KN1Ddxm/giphy.gif")
                    this.parseMode = "MarkdownV2"
                }
                execute(sendDocument)
            }
            if (messageCommand == "/info") {
                val sendDocument = SendMessage().apply {
                    this.chatId = chatId
                    this.text = """
                        Aqui você fica sabendo tudo sobre a She\-Ra\! 
                        Clique no personagem de sua preferência para saber sua história\, a sinopse do
                        nosso amado desenho\, a música tema e até onde assistir\!
                        Bom divertimento\!\!\!
                    """.trimIndent()
                    this.parseMode = "MarkdownV2"
                }

                execute(sendDocument)
            }
            if (messageCommand == "/sinopse") {
                val sendDocument = SendDocument().apply {
                    this.chatId = chatId
                    this.caption = sinopseShe(sinopse)
                    this.document =
                        InputFile().setMedia("https://c.tenor.com/ZWJUuC34gPMAAAAM/conectados-estamos-conectados.gif")
                    this.parseMode = "MarkdownV2"
                }
                execute(sendDocument)
            }
            if (messageCommand == "/SheRaEHeMan") {
                val sendDocument = SendDocument().apply {
                    this.chatId = chatId
                    this.document = InputFile().setMedia("https://i.gifer.com/6kbJ.mp4")
                    this.parseMode = "MarkdownV2"
                }
                execute(sendDocument)
                val sendMessage = SendMessage().apply {
                    this.chatId = chatId
                    this.text = """
                        She\-Ra é uma personagem da série de animação She\-Ra\: Princess of Power\. 
                        Ela é o alter ego da Princesa Adora e irmã gêmea de Principe Adam \(He\-Man\)\. 
                        She\-Ra e seus amigos da Grande Rebelião tentam defender o reino de Etheria contra as terríveis forças de Hordak\.
                        
                        He\-Man é o personagem principal de Masters of the Universe\, presente em uma série de histórias em quadrinhos e várias séries animadas\, caracterizadas pela sua força sobre\-humana\. 
                        Na maioria das variações\, ele é o alter ego do Príncipe Adam\.
                    """.trimIndent()
                    this.parseMode = "MarkdownV2"
                }
                execute(sendMessage)
            }
            if (messageCommand == "/Arqueiro") {
                val sendDocument = SendDocument().apply {
                    this.chatId = chatId
                    this.document =
                        InputFile().setMedia("https://64.media.tumblr.com/f9587cee2a97df8a68e16f79e4dc63ae/tumblr_n2eaatSoGS1rgjirzo1_640.gifv")
                    this.parseMode = "MarkdownV2"
                }
                execute(sendDocument)
                val sendMessage = SendMessage().apply {
                    this.chatId = chatId
                    this.text = """
                        Ele é o primeiro a dar Adora a chance de se juntar á Rebelião\, talvez indicando a natureza muito confiante\. 
                        Arqueiro é muitas vezes adimirado pelo mundo ao seu redor e mostrou\-se para protege\-lô e seus amigos\. 
                        Ele também é pouco facilmente impressionado com as outras pessoas\; especialmente as princesas\.
                    """.trimIndent()
                    this.parseMode = "MarkdownV2"
                }
                execute(sendMessage)
            }
            if (messageCommand == "/Cintilante") {
                val sendDocument = SendDocument().apply {
                    this.chatId = chatId
                    this.document =
                        InputFile().setMedia("https://64.media.tumblr.com/abc16fa412724e93d4704e89f8242c4f/tumblr_mic2h0h03T1rgjirzo1_500.gifv")
                    this.parseMode = "MarkdownV2"
                }
                execute(sendDocument)
                val sendMessage = SendMessage().apply {
                    this.chatId = chatId
                    this.text = """
                        Cintilante é a princesa de Lua Clara\. 
                        Ela é a filha da Rainha Ângela e do Rei Micah e é a melhor amiga de Arqueiro\. 
                        Ela é uma dos personagens principais da série\. Ela também é a co\-fundadora da Aliança da Princesa\, junto com Adora\, também conhecida como She\-Ra\.
                    """.trimIndent()
                    this.parseMode = "MarkdownV2"
                }
                execute(sendMessage)
            }
            if (messageCommand == "/Corujito") {
                val sendDocument = SendDocument().apply {
                    this.chatId = chatId
                    this.document =
                        InputFile().setMedia("https://i.pinimg.com/originals/9a/05/c5/9a05c508b305d23382fe2d7c554e6163.jpg")
                    this.parseMode = "MarkdownV2"
                }
                execute(sendDocument)
                val sendMessage = SendMessage().apply {
                    this.chatId = chatId
                    this.text = """
                        Corujito é uma espécie de coruja com partes do corpo de borboleta\. 
                        Quase sempre anda junto com Arqueiro e é um dos amigos mais leais de She\-Ra\. 
                        Ele também sabe que Adora é She\-Ra\. 
                    """.trimIndent()
                    this.parseMode = "MarkdownV2"
                }
                execute(sendMessage)
            }
            if (messageCommand == "/HordakEEsqueleto") {
                val sendDocument = SendDocument().apply {
                    this.chatId = chatId
                    this.document =
                        InputFile().setMedia("https://thumbs.gfycat.com/MedicalEqualCrustacean-size_restricted.gif")
                    this.parseMode = "MarkdownV2"
                }
                execute(sendDocument)
                val sendMessage = SendMessage().apply {
                    this.chatId = chatId
                    this.text = """
                        Hordak é o principal antagonista da série animada She\-Ra\: Princess of Power\, na qual ele é o maior arquiinimigo da irmã gêmea de He\-Man\. 
                        Hordak desempenhou papel do mal supremo da Eternia e do poder por trás do Esqueleto\.
                        
                        Esqueleto é um vilão do desenho animado He\-Man e os Mestres do Universo\. Esqueleto é o mestre do mal de Etérnia\. 
                        Obcecado pelo poder\, tenta de todas as formas dominar o castelo de Grayskull\, que representa o poder do bem em Etérnia\.
                    """.trimIndent()
                    this.parseMode = "MarkdownV2"
                }
                execute(sendMessage)
            }
            if (messageCommand == "/abertura") {
                val sendDocument = SendMessage().apply {
                    this.chatId = chatId
                    this.text = ("""
                        https\:\/\/www\.youtube\.com\/watch\?v\=0MXRB2lWpnA&ab\_channel\=JqRJogoqueRoda
                    """.trimIndent())
                    this.parseMode = "MarkdownV2"

                }
                execute(sendDocument)
            }
            if (messageCommand == "/assistir") {
                val sendDocument = SendMessage().apply {
                    this.chatId = chatId
                    this.text = ("""
                        https\:\/\/www\.youtube\.com\/watch\?v\=WoPG8aAy0Y4&list\=PLD5q7cL1ihv45JBFJT\-4\-iMkJVMGVVfaa\&ab\_channel\=\%40nimes\%2CTokusatsuse\%2B
                    """.trimIndent())
                    this.parseMode = "MarkdownV2"

                }
                execute(sendDocument)
            }
            /*else {
                    val sendDocument = SendMessage().apply {
                        this.chatId = chatId
                        this.text = EmojiParser.parseToUnicode("num funfou :blush:")
                        this.parseMode = "MarkdownV2"
                    }

                    execute(sendDocument)
                }*/
        } catch (e: TelegramApiException) {
            e.printStackTrace()
        }
    }

}

private fun getMessage(command: String?, nameSender: String?) = when (command) {
    "/start" -> welcome(nameSender)
    else -> "Aguarde..."
}

private fun welcome(nameSender: String?) = EmojiParser.parseToUnicode(
    """
        *Olaaaaaá :blush:, $nameSender\! Tudo bem\?*
        Bem\-vinde à terra da She\-Ra\!
         Escolha:
        \/start \- Opções
        \/info \- Para saber mais sobre o projeto
        \/sinopse \- Saiba a magnífica história de She\-Ra
        \/abertura \- assiat a abertura do desenho e mate a saudades
        \/assistir \- saiba onde ver os episódios
         
        \*Personagens \(clique e saiba quem é quem\)\:
        \/SheRaEHeMan \- \/Arqueiro \- \/Cintilante
        \/Corujito \- \/HordakEEsqueleto
    """
).trimIndent()

private fun sinopseShe(sinopse: String?) = ("""
        O planeta Etheria é vítima da ditadura Horda\, liderada pelo tirano Hordak e seu exército de mutantes guiados pela capitã Adora\.

Refugiados na Floresta do Sussurro sob o comando da princesa do reino de Lua Clara chamada Cintilante\, um grupo de rebeldes planejam estratégias para libertar o planeta das forças do mal\. 

No planeta Eternia\, a Feiticeira\, guardiã do Castelo de Grayskull\, desperta\-se de terríveis pesadelos e diante dela está uma espada idêntica à do herói He\-Man\, tendo como única diferença uma pedra cravejada ao corpo da arma\. 

A espada atrai a protetora do castelo até um portal dimensional\, o qual nunca tinha sido aberto antes\. Em sequência\, a espada cai aos pés da Feiticeira\, que a recolhe com surpresa\, dizendo\: \"É possível\?\! Após tantos anos\?\!\"

    Saiba mais em\:
    https\:\/\/pt\.wikipedia\.org\/wiki\/She\-Ra

""").trimIndent()



