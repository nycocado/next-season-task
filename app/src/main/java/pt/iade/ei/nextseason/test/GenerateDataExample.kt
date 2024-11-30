package pt.iade.ei.nextseason.test

import pt.iade.ei.nextseason.models.ContentItem
import pt.iade.ei.nextseason.models.Review
import pt.iade.ei.nextseason.models.User
import java.time.LocalDate
import java.time.LocalDateTime

fun generateReviewListExample(): List<Review> {
    val user1 = User(1, "Ana Clara Rodrigues")
    val user2 = User(2, "Eduardo Costa")
    val user3 = User(3, "Beatriz Silva")
    val user4 = User(4, "Camila Souza")
    val user5 = User(5, "João Vitor Oliveira")
    val user6 = User(6, "Fernanda Martins")
    val user7 = User(7, "Gustavo Pereira")

    return listOf(
        Review(
            id = 1,
            user = user1,
            comment = "Uma história intensa e envolvente, conduzida por uma narrativa rica em detalhes que prende a atenção a cada cena. Os personagens são bem desenvolvidos, e a trama evolui de maneira natural, deixando o público imerso do início ao fim.",
            rating = (1..5).random(),
            publishedDate = LocalDateTime.now()
        ),
        Review(
            id = 2,
            user = user2,
            comment = "A produção se destaca pela qualidade técnica e pela capacidade de criar uma atmosfera única. A direção cuidadosa e as atuações marcantes dão vida a uma história que permanece na mente muito depois de terminar.",
            rating = (1..5).random(),
            publishedDate = LocalDateTime.now()
        ),
        Review(
            id = 3,
            user = user3,
            comment = "Com reviravoltas inteligentes e momentos inesperados, esta obra mantém o ritmo e a tensão em alta. A construção do universo apresentado é minuciosa e dá profundidade ao enredo, proporcionando uma experiência instigante.",
            rating = (1..5).random(),
            publishedDate = LocalDateTime.now()
        ),
        Review(
            id = 4,
            user = user4,
            comment = "Um trabalho que equilibra perfeitamente emoção e narrativa. A história progride de forma orgânica, levando o público a se conectar com os personagens e seus desafios de maneira autêntica.",
            rating = (1..5).random(),
            publishedDate = LocalDateTime.now()
        ),
        Review(
            id = 5,
            user = user5,
            comment = "Os visuais impressionantes e a trilha sonora bem selecionada complementam uma narrativa instigante, criando uma experiência audiovisual memorável. A trama é bem amarrada e oferece momentos de pura imersão.",
            rating = (1..5).random(),
            publishedDate = LocalDateTime.now()
        ),
        Review(
            id = 6,
            user = user6,
            comment = "Uma obra que explora temas complexos com profundidade, trazendo questionamentos relevantes e momentos de introspecção. A construção dos personagens é detalhada, e o desfecho entrega uma conclusão satisfatória.",
            rating = (1..5).random(),
            publishedDate = LocalDateTime.now()
        ),
        Review(
            id = 7,
            user = user7,
            comment = "Com uma abordagem única e um enredo intrigante, a produção surpreende com sua originalidade. Cada episódio (ou ato) revela novos elementos que enriquecem a narrativa, mantendo o público sempre atento.",
            rating = (1..5).random(),
            publishedDate = LocalDateTime.now()
        )
    )
}

fun generateContentItemListExample(): List<ContentItem> {
    return listOf(
        ContentItem(
            id = 1,
            title = "Arcane",
            description = "Amid the stark discord of twin cities Piltover and Zaun, two sisters fight on rival sides of a war between magic technologies and clashing convictions.",
            banner = "https://image.tmdb.org/t/p/original/fqldf2t8ztc9aiwn3k6mlX3tvRT.jpg",
            cover = "https://image.tmdb.org/t/p/original/q8eejQcg1bAqImEV8jh8RtBD4uH.jpg",
            votes = (-100..100).random(),
            genre = "Sci-Fi & Fantasy",
            releaseDate = LocalDate.parse("2021-11-06"),
            duration = 739,
            reviews = generateReviewListExample()
        ),
        ContentItem(
            id = 2,
            title = "Breaking Bad",
            description = "Walter White, a New Mexico chemistry teacher, is diagnosed with Stage III cancer and given a prognosis of only two years left to live. He becomes filled with a sense of fearlessness and an unrelenting desire to secure his family's financial future at any cost as he enters the dangerous world of drugs and crime.",
            banner = "https://image.tmdb.org/t/p/original/ztkUQFLlC19CCMYHW9o1zWhJRNq.jpg",
            cover = "https://image.tmdb.org/t/p/original/gc8PfyTqzqltKPW3X0cIVUGmagz.jpg",
            votes = (-100..100).random(),
            genre = "Drama",
            releaseDate = LocalDate.parse("2008-01-20"),
            duration = 8040,
            reviews = generateReviewListExample()
        ),
        ContentItem(
            id = 3,
            title = "Interstellar",
            description = "The adventures of a group of explorers who make use of a newly discovered wormhole to surpass the limitations on human space travel and conquer the vast distances involved in an interstellar voyage.",
            banner = "https://image.tmdb.org/t/p/original/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg",
            cover = "https://image.tmdb.org/t/p/original/xJHokMbljvjADYdit5fK5VQsXEG.jpg",
            votes = (-100..100).random(),
            genre = "Drama",
            releaseDate = LocalDate.parse("2014-11-06"),
            duration = 169,
            reviews = generateReviewListExample()
        ),
        ContentItem(
            id = 4,
            title = "The Bear",
            description = "Carmy, a young fine-dining chef, comes home to Chicago to run his family sandwich shop. As he fights to transform the shop and himself, he works alongside a rough-around-the-edges crew that ultimately reveal themselves as his chosen family.",
            banner = "https://image.tmdb.org/t/p/original/3MVHF64rlvH1eofKefIoazXwOK0.jpg",
            cover = "https://image.tmdb.org/t/p/original/csnJf7QslLWl2oekdm3mO3INFiq.jpg",
            votes = (-100..100).random(),
            genre = "Drama",
            releaseDate = LocalDate.parse("2022-06-23"),
            duration = 3840,
            reviews = generateReviewListExample()
        ),
        ContentItem(
            id = 5,
            title = "Doctor Who",
            description = "The Doctor is a Time Lord: a 900 year old alien with 2 hearts, part of a gifted civilization who mastered time travel. The Doctor saves planets for a living—more of a hobby actually, and the Doctor's very, very good at it.",
            banner = "https://image.tmdb.org/t/p/original/4edFyasCrkH4MKs6H4mHqlrxA6b.jpg",
            cover = "https://image.tmdb.org/t/p/original/vcFW09U4834DyFOeRZpsx9x1D3S.jpg",
            votes = (-100..100).random(),
            genre = "Adventure",
            releaseDate = LocalDate.parse("2005-03-26"),
            duration = 15525,
            reviews = generateReviewListExample()
        ),
    )
}